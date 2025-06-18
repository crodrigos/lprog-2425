package org.lprog.grammar.mission;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.lprog.domain.mission.Mission;
import org.lprog.domain.mission.Point;
import org.lprog.domain.model.Model;
import org.lprog.grammar.model.ModelLexer;
import org.lprog.grammar.model.ModelVisitorImpl;

import java.io.IOException;
import java.util.*;

public class MissionVisitorImpl implements MissionVisitor {

    private String startDate;
    private String modelName;
    private Point startingPoint;
    private List<Point> deliveries = new ArrayList<>();

    List<Mission> missions = new ArrayList<>();

    @Override
    public Object visitFile(MissionParser.FileContext ctx) {
        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            //Visit each mission read on the file
            ctx.getChild(i).accept(this);
        }
        return null;
    }

    @Override
    public Object visitMissionEnd(MissionParser.MissionEndContext ctx) {
        missions.add(BuildMission());
        return null;
    }

    @Override
    public Object visitMission(MissionParser.MissionContext ctx) {
        ((MissionParser.BodyContext) ctx.children.get(3)).accept(this);
        ctx.children.get(ctx.getChildCount() - 1).accept(this);
        return null;
    }

    @Override
    public Object visitBody(MissionParser.BodyContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            ctx.getChild(i).accept(this);
        }
        return null;
    }

    @Override
    public Object visitStaringTime(MissionParser.StaringTimeContext ctx) {
        this.startDate = ctx.getChild(2).getText();
        return null;
    }

    @Override
    public Object visitModel(MissionParser.ModelContext ctx) {
        this.modelName = ctx.getChild(2).getText();
        return null;
    }

    @Override
    public Object visitStartingPoint(MissionParser.StartingPointContext ctx) {
        String rawText = ctx.getChild(2).getText().trim();
        if (rawText.startsWith("(") && rawText.endsWith(")")) {
            rawText = rawText.substring(1, rawText.length() - 1); // Remove the parentheses
        }
        String[] coordinates = rawText.split(",");
        if (coordinates.length == 3) {
            try {
                int latitude = Integer.parseInt(coordinates[0].trim());
                int altitude = Integer.parseInt(coordinates[1].trim());
                int longitude = Integer.parseInt(coordinates[2].trim());
                this.startingPoint = new Point(latitude, altitude, longitude);
            } catch (NumberFormatException e) {
                // Handle invalid number format
                System.err.println("Invalid coordinates for starting point: " + ctx.getText());
            }
        } else {
            this.startingPoint = null;
        }
        return null;
    }

    @Override
    public Object visitListOfDeliveries(MissionParser.ListOfDeliveriesContext ctx) {
        try {
            this.deliveries.clear();

            ParseTree listOfPoints = ctx.getChild(2).getChild(1);
            int numOfPoints = listOfPoints.getChildCount();
            int numOfPointsSoFar = 0;

            for (int i = 0; i < numOfPoints; i++) {
                if (i % 2 == 0) {
                    String point = listOfPoints.getChild(i).getText();
                    if (point.startsWith("(") && point.endsWith(")")) {
                        point = point.substring(1, point.length() - 1); // Remove the parentheses
                    }
                    String[] coordinates = point.split(",");
                    numOfPointsSoFar++;
                    if (coordinates.length == 3) {
                        try {
                            int latitude = Integer.parseInt(coordinates[0].trim());
                            int altitude = Integer.parseInt(coordinates[1].trim());
                            int longitude = Integer.parseInt(coordinates[2].trim());
                            Point newPoint = new Point(latitude, altitude, longitude);
                            this.deliveries.add(newPoint);
                        } catch (NumberFormatException e) {
                            // Handle invalid number format
                            System.err.println("Invalid coordinates for point #" + numOfPointsSoFar + " :" + point);
                        }
                    } else {
                        this.deliveries.add(new Point(0,0,0));
                    }
                }
            }

        } catch (Exception e) {
            this.deliveries = new ArrayList<>();
        }
        return ctx;
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
    public Object visitPoint(MissionParser.PointContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return parseTree.accept(this);
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

    private Mission BuildMission() {
        List<Point> newDeliveries = new ArrayList<>(deliveries);
        return new Mission(
                this.startDate,
                this.modelName,
                this.startingPoint,
                newDeliveries
        );
    }

    public List<Mission> GetMissions() {
        return new ArrayList<>(this.missions);
    }

    public static List<Mission> GetMissionFromFile (String filePath) throws IOException {
        MissionLexer lexer = new MissionLexer(CharStreams.fromFileName(filePath));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MissionParser parser = new MissionParser(tokens);

        ParseTree tree = parser.file();
        System.out.println(tree.toStringTree(parser));

        MissionVisitorImpl visitor = new MissionVisitorImpl();
        visitor.visit(tree);
        List<Mission> missions = visitor.GetMissions();

        return missions;
    }
}
