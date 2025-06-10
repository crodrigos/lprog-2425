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
}