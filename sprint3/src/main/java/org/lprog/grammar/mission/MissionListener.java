// Generated from org/lprog/grammar/mission/Mission.g4 by ANTLR 4.9.3
package org.lprog.grammar.mission;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MissionParser}.
 */
public interface MissionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MissionParser#mission}.
	 * @param ctx the parse tree
	 */
	void enterMission(MissionParser.MissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissionParser#mission}.
	 * @param ctx the parse tree
	 */
	void exitMission(MissionParser.MissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissionParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MissionParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissionParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MissionParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaringTime}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterStaringTime(MissionParser.StaringTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaringTime}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitStaringTime(MissionParser.StaringTimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DroneSerialNumber}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterDroneSerialNumber(MissionParser.DroneSerialNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DroneSerialNumber}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitDroneSerialNumber(MissionParser.DroneSerialNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartingPoint}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterStartingPoint(MissionParser.StartingPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartingPoint}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitStartingPoint(MissionParser.StartingPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListOfDeliveries}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterListOfDeliveries(MissionParser.ListOfDeliveriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListOfDeliveries}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitListOfDeliveries(MissionParser.ListOfDeliveriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissionParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MissionParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissionParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MissionParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MissionParser#listBody}.
	 * @param ctx the parse tree
	 */
	void enterListBody(MissionParser.ListBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MissionParser#listBody}.
	 * @param ctx the parse tree
	 */
	void exitListBody(MissionParser.ListBodyContext ctx);
}