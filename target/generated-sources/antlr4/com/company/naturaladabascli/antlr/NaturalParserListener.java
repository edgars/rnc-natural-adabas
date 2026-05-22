// Generated from com/company/naturaladabascli/antlr/NaturalParser.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NaturalParser}.
 */
public interface NaturalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NaturalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NaturalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NaturalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#programElement}.
	 * @param ctx the parse tree
	 */
	void enterProgramElement(NaturalParser.ProgramElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#programElement}.
	 * @param ctx the parse tree
	 */
	void exitProgramElement(NaturalParser.ProgramElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#defineData}.
	 * @param ctx the parse tree
	 */
	void enterDefineData(NaturalParser.DefineDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#defineData}.
	 * @param ctx the parse tree
	 */
	void exitDefineData(NaturalParser.DefineDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#dataLine}.
	 * @param ctx the parse tree
	 */
	void enterDataLine(NaturalParser.DataLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#dataLine}.
	 * @param ctx the parse tree
	 */
	void exitDataLine(NaturalParser.DataLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#defineLine}.
	 * @param ctx the parse tree
	 */
	void enterDefineLine(NaturalParser.DefineLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#defineLine}.
	 * @param ctx the parse tree
	 */
	void exitDefineLine(NaturalParser.DefineLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(NaturalParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(NaturalParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#findStatement}.
	 * @param ctx the parse tree
	 */
	void enterFindStatement(NaturalParser.FindStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#findStatement}.
	 * @param ctx the parse tree
	 */
	void exitFindStatement(NaturalParser.FindStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#readLikeStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadLikeStatement(NaturalParser.ReadLikeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#readLikeStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadLikeStatement(NaturalParser.ReadLikeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#histogramStatement}.
	 * @param ctx the parse tree
	 */
	void enterHistogramStatement(NaturalParser.HistogramStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#histogramStatement}.
	 * @param ctx the parse tree
	 */
	void exitHistogramStatement(NaturalParser.HistogramStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#storeStatement}.
	 * @param ctx the parse tree
	 */
	void enterStoreStatement(NaturalParser.StoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#storeStatement}.
	 * @param ctx the parse tree
	 */
	void exitStoreStatement(NaturalParser.StoreStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(NaturalParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(NaturalParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(NaturalParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(NaturalParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#endTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndTransactionStatement(NaturalParser.EndTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#endTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndTransactionStatement(NaturalParser.EndTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#backoutTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBackoutTransactionStatement(NaturalParser.BackoutTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#backoutTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBackoutTransactionStatement(NaturalParser.BackoutTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#callnatStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallnatStatement(NaturalParser.CallnatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#callnatStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallnatStatement(NaturalParser.CallnatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#callArgList}.
	 * @param ctx the parse tree
	 */
	void enterCallArgList(NaturalParser.CallArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#callArgList}.
	 * @param ctx the parse tree
	 */
	void exitCallArgList(NaturalParser.CallArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#performStatement}.
	 * @param ctx the parse tree
	 */
	void enterPerformStatement(NaturalParser.PerformStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#performStatement}.
	 * @param ctx the parse tree
	 */
	void exitPerformStatement(NaturalParser.PerformStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(NaturalParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(NaturalParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void enterComputeStatement(NaturalParser.ComputeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void exitComputeStatement(NaturalParser.ComputeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(NaturalParser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(NaturalParser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(NaturalParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(NaturalParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(NaturalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(NaturalParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(NaturalParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(NaturalParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#reinputStatement}.
	 * @param ctx the parse tree
	 */
	void enterReinputStatement(NaturalParser.ReinputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#reinputStatement}.
	 * @param ctx the parse tree
	 */
	void exitReinputStatement(NaturalParser.ReinputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(NaturalParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(NaturalParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(NaturalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(NaturalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#decideStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecideStatement(NaturalParser.DecideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#decideStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecideStatement(NaturalParser.DecideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#decideBranch}.
	 * @param ctx the parse tree
	 */
	void enterDecideBranch(NaturalParser.DecideBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#decideBranch}.
	 * @param ctx the parse tree
	 */
	void exitDecideBranch(NaturalParser.DecideBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockContent(NaturalParser.BlockContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#blockContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockContent(NaturalParser.BlockContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NaturalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NaturalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#unknownStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnknownStatement(NaturalParser.UnknownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#unknownStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnknownStatement(NaturalParser.UnknownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void enterUnknownLine(NaturalParser.UnknownLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void exitUnknownLine(NaturalParser.UnknownLineContext ctx);
}