package org.lprog.grammar.model;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lprog.domain.model.Model;
import org.lprog.domain.model.Sensor;

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
    public Object visitModel(ModelParser.ModelContext ctx) {
        return null;
    }

    @Override
    public Object visitStructureBody(ModelParser.StructureBodyContext ctx) {
        return null;
    }

    @Override
    public Object visitNameField(ModelParser.NameFieldContext ctx) {
        this.modelName = ctx.getText();
        return null;
    }

    @Override
    public Object visitCargoCapacityField(ModelParser.CargoCapacityFieldContext ctx) {
        this.cargoCapacity = Integer.parseInt(ctx.getText());
        return null;
    }

    @Override
    public Object visitAutonomyField(ModelParser.AutonomyFieldContext ctx) {
        this.autonomy = Integer.parseInt(ctx.getText());
        return null;
    }

    @Override
    public Object visitCruisingVelocityField(ModelParser.CruisingVelocityFieldContext ctx) {
        this.cruisingVelocity = Integer.parseInt(ctx.getText());
        return null;
    }

    @Override
    public Object visitLiftingVelocityField(ModelParser.LiftingVelocityFieldContext ctx) {
        this.liftingVelocity = Integer.parseInt(ctx.getText());
        return null;
    }

    @Override
    public Object visitLandingVelocityField(ModelParser.LandingVelocityFieldContext ctx) {
        this.landingVelocity = Integer.parseInt(ctx.getText());
        return null;
    }

    @Override
    public Object visitSensorsField(ModelParser.SensorsFieldContext ctx) {
        for (var id : ctx.children) {
            System.out.println(id.getText());
        }
        return null;
    }

    @Override
    public Object visitLimitationsField(ModelParser.LimitationsFieldContext ctx) {
        return null;
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
    public Object visit(ParseTree parseTree) {
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
}
