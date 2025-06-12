// Generated from org/lprog/grammar/drone/DroneFleet.g4 by ANTLR 4.9.3
package org.lprog.grammar.drone;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DroneFleetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DroneFleetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DroneFleetParser#fleet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFleet(DroneFleetParser.FleetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroneFleetParser#droneEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDroneEntry(DroneFleetParser.DroneEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroneFleetParser#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(DroneFleetParser.AtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroneFleetParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(DroneFleetParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DroneFleetParser#restrictionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrictionList(DroneFleetParser.RestrictionListContext ctx);
}