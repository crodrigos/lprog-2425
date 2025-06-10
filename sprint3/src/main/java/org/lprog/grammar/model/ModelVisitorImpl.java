package org.lprog.grammar.model;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModelVisitorImpl implements ModelVisitor {

    private String modelName;
    private int cargoCapacity;
    private int autonomy;
    private int cruisingVelocity;
    private int liftingVelocity;
    private int landingVelocity;
    private List<Sensor> sensors = new ArrayList<>();
    private List<String> limitations = new ArrayList<>();

    @Override
    public Object visitFile(ModelParser.FileContext ctx) {
        return null;
    }

    @Override
    public Object visitModel(ModelParser.ModelContext ctx) {

        // Check if all variables have values


        return ((ModelParser.StructureBodyContext) ctx.children.get(3)).accept(this);
    }

    @Override
    public Object visitStructureBody(ModelParser.StructureBodyContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i+=2) {
            ctx.getChild(i).accept(this);
        }
        return ctx;
    }

    @Override
    public Object visitNameField(ModelParser.NameFieldContext ctx) {
        this.modelName = ctx.getChild(2).getText();
        return ctx;
    }

    @Override
    public Object visitCargoCapacityField(ModelParser.CargoCapacityFieldContext ctx) {
        this.cargoCapacity = Integer.parseInt(ctx.getChild(2).getText());
        return ctx;
    }

    @Override
    public Object visitAutonomyField(ModelParser.AutonomyFieldContext ctx) {
        this.autonomy = Integer.parseInt(ctx.getChild(2).getText());
        return ctx;
    }

    @Override
    public Object visitCruisingVelocityField(ModelParser.CruisingVelocityFieldContext ctx) {
        this.cruisingVelocity = Integer.parseInt(ctx.getChild(2).getText());
        return ctx;
    }

    @Override
    public Object visitLiftingVelocityField(ModelParser.LiftingVelocityFieldContext ctx) {
        this.liftingVelocity = Integer.parseInt(ctx.getChild(2).getText());
        return null;
    }

    @Override
    public Object visitLandingVelocityField(ModelParser.LandingVelocityFieldContext ctx) {
        this.landingVelocity = Integer.parseInt(ctx.getChild(2).getText());
        return null;
    }

    @Override
    public Object visitSensorsField(ModelParser.SensorsFieldContext ctx) {
        try {
            List<Sensor> sensors = new ArrayList<>();

            ModelParser.ListContext sensorList = (ModelParser.ListContext) ctx.children.get(2);
            ModelParser.ListBodyContext sensorListBody = (ModelParser.ListBodyContext) sensorList.children.get(1);

            for (int i = 0; i < sensorListBody.getChildCount(); i+=2) {
                ModelParser.ValueContext value = (ModelParser.ValueContext) sensorListBody.getChild(i);

                List<Sensor> allSensors = Sensor.getAllSensors();
                for (Sensor sensor : allSensors) {
                    if (value.getText().equalsIgnoreCase(sensor.shrt)) {
                        sensors.add(sensor);
                    }
                }
            }

            this.sensors = sensors;

        } catch (Exception e) {
            this.sensors = new ArrayList<>();
        }
        return ctx;
    }

    @Override
    public Object visitLimitationsField(ModelParser.LimitationsFieldContext ctx) {
        try {

            List<String> limitations = new ArrayList<>();

            ModelParser.ListContext limitList = (ModelParser.ListContext) ctx.children.get(2);
            ModelParser.ListBodyContext limitListBody = (ModelParser.ListBodyContext) limitList.children.get(1);

            for (int i = 0; i < limitListBody.getChildCount(); i+=2) {
                ModelParser.ValueContext value = (ModelParser.ValueContext) limitListBody.getChild(i);
                limitations.add(value.getText().replace("\"", ""));
            }
            this.limitations = limitations;
        } catch (Exception e) {
            this.sensors = new ArrayList<>();
        }
        return ctx;
    }

    @Override
    public Object visitList(ModelParser.ListContext ctx) {
        return null;
    }

    @Override
    public Object visitListBody(ModelParser.ListBodyContext ctx) {
        return null;
    }

    @Override
    public Object visitValue(ModelParser.ValueContext ctx) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return parseTree.accept(this);
    }

    public Model GetModel() {
        return new Model(
                this.modelName,
                this.cargoCapacity,
                this.autonomy,
                this.cruisingVelocity,
                this.liftingVelocity,
                this.landingVelocity,
                this.sensors,
                this.limitations
        );
    }

    public static Model GetModelFromFile(String path) throws IOException {
        ModelLexer lexer = new ModelLexer(CharStreams.fromFileName(path));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ModelParser parser = new ModelParser(tokens);

        ParseTree tree = parser.model();
        //System.out.println(tree.toStringTree());

        ModelVisitorImpl visitor = new ModelVisitorImpl();
        //visitor.visit(tree);
        visitor.visit(tree);
        Model model = visitor.GetModel();

        return model;
    }
}
