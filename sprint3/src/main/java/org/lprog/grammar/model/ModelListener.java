// Generated from org/lprog/grammar/model/Model.g4 by ANTLR 4.9.3
package org.lprog.grammar.model;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ModelParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ModelParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(ModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(ModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#structureBody}.
	 * @param ctx the parse tree
	 */
	void enterStructureBody(ModelParser.StructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#structureBody}.
	 * @param ctx the parse tree
	 */
	void exitStructureBody(ModelParser.StructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterNameField(ModelParser.NameFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitNameField(ModelParser.NameFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CargoCapacityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterCargoCapacityField(ModelParser.CargoCapacityFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CargoCapacityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitCargoCapacityField(ModelParser.CargoCapacityFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AutonomyField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterAutonomyField(ModelParser.AutonomyFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AutonomyField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitAutonomyField(ModelParser.AutonomyFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CruisingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterCruisingVelocityField(ModelParser.CruisingVelocityFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CruisingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitCruisingVelocityField(ModelParser.CruisingVelocityFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiftingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterLiftingVelocityField(ModelParser.LiftingVelocityFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiftingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitLiftingVelocityField(ModelParser.LiftingVelocityFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LandingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterLandingVelocityField(ModelParser.LandingVelocityFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LandingVelocityField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitLandingVelocityField(ModelParser.LandingVelocityFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SensorsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterSensorsField(ModelParser.SensorsFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SensorsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitSensorsField(ModelParser.SensorsFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LimitationsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterLimitationsField(ModelParser.LimitationsFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LimitationsField}
	 * labeled alternative in {@link ModelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitLimitationsField(ModelParser.LimitationsFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ModelParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ModelParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#listBody}.
	 * @param ctx the parse tree
	 */
	void enterListBody(ModelParser.ListBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#listBody}.
	 * @param ctx the parse tree
	 */
	void exitListBody(ModelParser.ListBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ModelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ModelParser.ValueContext ctx);
}