// Generated from drone\DroneFleet.g4 by ANTLR 4.9.3
package org.lprog.grammar.drone;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DroneFleetParser}.
 */
public interface DroneFleetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DroneFleetParser#fleet}.
	 * @param ctx the parse tree
	 */
	void enterFleet(DroneFleetParser.FleetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroneFleetParser#fleet}.
	 * @param ctx the parse tree
	 */
	void exitFleet(DroneFleetParser.FleetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroneFleetParser#droneEntry}.
	 * @param ctx the parse tree
	 */
	void enterDroneEntry(DroneFleetParser.DroneEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroneFleetParser#droneEntry}.
	 * @param ctx the parse tree
	 */
	void exitDroneEntry(DroneFleetParser.DroneEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroneFleetParser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(DroneFleetParser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroneFleetParser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(DroneFleetParser.AtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroneFleetParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(DroneFleetParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroneFleetParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(DroneFleetParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DroneFleetParser#restrictionList}.
	 * @param ctx the parse tree
	 */
	void enterRestrictionList(DroneFleetParser.RestrictionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DroneFleetParser#restrictionList}.
	 * @param ctx the parse tree
	 */
	void exitRestrictionList(DroneFleetParser.RestrictionListContext ctx);
}