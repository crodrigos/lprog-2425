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
            if (atributo.getStart().getText().equals("SN")) {
                sn = atributo.IDENT().getText();
                if (sn.length() != 10 || sn.charAt(1) != '-') {
                    throw new RuntimeException("Número de série inválido: " + sn);
                }

            } else if (atributo.getStart().getText().equals("TV")) {
                tv = Integer.parseInt(atributo.INT().getText());

            } else if (atributo.getStart().getText().equals("MD")) {
                String modelName = atributo.IDENT().getText();
                model = modelosDisponiveis.get(modelName);
                if (model == null) {
                    throw new RuntimeException("Modelo não encontrado: " + modelName);
                }

            } else if (atributo.getStart().getText().equals("RT")) {
                if (atributo.restrictionList() != null) {
                    for (var s : atributo.restrictionList().STRING()) {
                        restrictions.add(cleanQuoted(s.getText()));
                    }
                }

            } else if (atributo.getStart().getText().equals("EA")) {
                status = Status.valueOf(atributo.STATUS().getText());
            }
        }

        if (sn == null || tv == null || model == null || status == null) {
            throw new RuntimeException("Campos obrigatórios em falta ao criar drone.");
        }

        return new Drone(sn, tv, model, restrictions, status);
    }

    private String cleanQuoted(String text) {
        return text.substring(1, text.length() - 1);
    }
}
