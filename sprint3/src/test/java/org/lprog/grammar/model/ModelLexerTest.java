package org.lprog.grammar.model;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelLexerTest {

    public String pathToTestFile = "src/test/resources/model_example";

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
    @DisplayName("Test if Lexer reads from file path")
    public void testExample1Model() throws IOException {

        List<Model> models = ModelVisitorImpl.GetModelFromFile(pathToTestFile);

        Assertions.assertEquals(models, example1Model);
    }

}
