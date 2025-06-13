package org.lprog.grammar.mission;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MissionVisitorImpl implements MissionVisitor {
    @Override
    public Object visitMission(MissionParser.MissionContext ctx) {
        return null;
    }

    @Override
    public Object visitBody(MissionParser.BodyContext ctx) {
        return null;
    }

    @Override
    public Object visitStaringTime(MissionParser.StaringTimeContext ctx) {
        return null;
    }

    @Override
    public Object visitModel(MissionParser.ModelContext ctx) {
        return null;
    }

    @Override
    public Object visitStartingPoint(MissionParser.StartingPointContext ctx) {
        return null;
    }

    @Override
    public Object visitListOfDeliveries(MissionParser.ListOfDeliveriesContext ctx) {
        return null;
    }

    @Override
    public Object visitList(MissionParser.ListContext ctx) {
        return null;
    }

    @Override
    public Object visitListBody(MissionParser.ListBodyContext ctx) {
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
}
