package org.lprog.grammar.drone;

import org.lprog.domain.drone.Drone;
import org.lprog.domain.drone.Status;
import org.lprog.domain.model.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DroneFleetVisitorImpl extends DroneFleetBaseVisitor<Drone> {

    private final Map<String, Model> modelosDisponiveis;

    public DroneFleetVisitorImpl(Map<String, Model> modelosDisponiveis) {
        this.modelosDisponiveis = modelosDisponiveis;
    }

    @Override
    public Drone visitDroneEntry(DroneFleetParser.DroneEntryContext ctx) {
        String sn = null;
        Integer tv = null;
        Model model = null;
        List<String> restrictions = new ArrayList<>();
        Status status = null;

        for (var atributo : ctx.atributos().atributo()) {
            String chave = atributo.getStart().getText();

            try {
                switch (chave) {
                    case "SN" -> {
                        if (atributo.IDENT() == null) {
                            erro(atributo, "Número de série ausente ou mal formado.");
                        }
                        sn = atributo.IDENT().getText();
                        if (sn.length() != 10 || sn.charAt(1) != '-') {
                            erro(atributo, "Número de série inválido: " + sn);
                        }
                    }

                    case "TV" -> {
                        if (atributo.INT() == null) {
                            erro(atributo, "Valor de tempo de voo ausente ou inválido.");
                        }
                        tv = Integer.parseInt(atributo.INT().getText());
                    }

                    case "MD" -> {
                        if (atributo.IDENT() == null) {
                            erro(atributo, "Modelo ausente ou inválido.");
                        }
                        String modelName = atributo.IDENT().getText();
                        model = modelosDisponiveis.get(modelName);
                        if (model == null) {
                            erro(atributo, "Modelo não encontrado: " + modelName);
                        }
                    }

                    case "RT" -> {
                        if (atributo.restrictionList() != null) {
                            for (var s : atributo.restrictionList().STRING()) {
                                restrictions.add(cleanQuoted(s.getText()));
                            }
                        }
                    }

                    case "EA" -> {
                        if (atributo.STATUS() == null) {
                            erro(atributo, "Estado da aeronave ausente ou inválido.");
                        }
                        try {
                            status = Status.valueOf(atributo.STATUS().getText());
                        } catch (IllegalArgumentException e) {
                            erro(atributo, "Estado desconhecido: " + atributo.STATUS().getText());
                        }
                    }

                    default -> erro(atributo, "Atributo desconhecido: " + chave);
                }

            } catch (RuntimeException e) {
                // Propaga erro com linha associada
                throw new RuntimeException(
                    "Erro na linha " + atributo.getStart().getLine() + ": " + e.getMessage(), e
                );
            }
        }

        if (sn == null || tv == null || model == null || status == null) {
            throw new RuntimeException("Campos obrigatórios em falta ao criar drone. Linha " +
                                       ctx.getStart().getLine());
        }

        return new Drone(sn, tv, model, restrictions, status);
    }

    private void erro(DroneFleetParser.AtributoContext ctx, String mensagem) {
        throw new RuntimeException("Linha " + ctx.getStart().getLine() + ": " + mensagem);
    }

    private String cleanQuoted(String text) {
        return text.substring(1, text.length() - 1); // Remove aspas
    }
}
