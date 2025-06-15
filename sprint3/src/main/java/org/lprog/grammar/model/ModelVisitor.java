// Generated from org/lprog/grammar/model/Model.g4 by ANTLR 4.9.3
package org.lprog.grammar.model;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModelParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ModelParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(ModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#modelEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelEnd(ModelParser.ModelEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#structureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureBody(ModelParser.StructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameField(ModelParser.NameFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CargoCapacityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargoCapacityField(ModelParser.CargoCapacityFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AutonomyField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutonomyField(ModelParser.AutonomyFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CruisingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCruisingVelocityField(ModelParser.CruisingVelocityFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiftingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiftingVelocityField(ModelParser.LiftingVelocityFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LandingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLandingVelocityField(ModelParser.LandingVelocityFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SensorsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensorsField(ModelParser.SensorsFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LimitationsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitationsField(ModelParser.LimitationsFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ModelParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#listBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBody(ModelParser.ListBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ModelParser.ValueContext ctx);
}