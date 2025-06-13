// Generated from org/lprog/grammar/mission/Mission.g4 by ANTLR 4.9.3
package org.lprog.grammar.mission;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MissionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MissionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MissionParser#mission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMission(MissionParser.MissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissionParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MissionParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaringTime}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaringTime(MissionParser.StaringTimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DroneSerialNumber}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDroneSerialNumber(MissionParser.DroneSerialNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StartingPoint}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartingPoint(MissionParser.StartingPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfDeliveries}
	 * labeled alternative in {@link MissionParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfDeliveries(MissionParser.ListOfDeliveriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissionParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MissionParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MissionParser#listBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBody(MissionParser.ListBodyContext ctx);
}