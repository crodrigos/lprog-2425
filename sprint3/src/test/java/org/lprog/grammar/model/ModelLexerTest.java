package org.lprog.grammar.model;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelLexerTest {

    public String example1Text = "Model:{\n" +
        "    NM:FX001;\n" +
        "    CC:20000;\n" +
        "    AT:60;\n" +
        "    VC:20;\n" +
        "    VS:5;\n" +
        "    VD:5;\n" +
        "    SS:[GPS,CAM];\n" +
        "    LO:[\"Máximo de horas de voo\"];\n" +
        "}";

    public Model example1Model = new Model(
            "FX001",
            20000,
            60,
            20,
            5,
            5,
            new ArrayList<Sensor>(Arrays.asList(Sensor.GPS, Sensor.CAMERA)),
            new ArrayList<String>(Arrays.asList("Máximo de horas de voo"))
    );

    @Test
    @DisplayName("Test if Lexer reads stream of chars correctly")
    public void testExample1Model() {

        ModelLexer lexer = new ModelLexer(CharStreams.fromString(example1Text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ModelParser parser = new ModelParser(tokens);

        ParseTree tree = parser.model();
        //System.out.println(tree.toStringTree());

        ModelVisitorImpl visitor = new ModelVisitorImpl();
        //visitor.visit(tree);
        visitor.visit(tree);
        Model model = visitor.GetModel();

        Assertions.assertEquals(model, example1Model);
    }

}
