// Generated from com/company/naturaladabascli/antlr/NaturalParser.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NaturalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NaturalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NaturalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NaturalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#programElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramElement(NaturalParser.ProgramElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#defineData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineData(NaturalParser.DefineDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#dataLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataLine(NaturalParser.DataLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#defineLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineLine(NaturalParser.DefineLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(NaturalParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#findStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFindStatement(NaturalParser.FindStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#readLikeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLikeStatement(NaturalParser.ReadLikeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#histogramStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogramStatement(NaturalParser.HistogramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#storeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreStatement(NaturalParser.StoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(NaturalParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(NaturalParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#endTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTransactionStatement(NaturalParser.EndTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#backoutTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackoutTransactionStatement(NaturalParser.BackoutTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#callnatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallnatStatement(NaturalParser.CallnatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#callArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgList(NaturalParser.CallArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#performStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformStatement(NaturalParser.PerformStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(NaturalParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#computeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeStatement(NaturalParser.ComputeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(NaturalParser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(NaturalParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(NaturalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(NaturalParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#reinputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReinputStatement(NaturalParser.ReinputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(NaturalParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(NaturalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#decideStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideStatement(NaturalParser.DecideStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#decideBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecideBranch(NaturalParser.DecideBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#blockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContent(NaturalParser.BlockContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NaturalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#unknownStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownStatement(NaturalParser.UnknownStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalParser#unknownLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownLine(NaturalParser.UnknownLineContext ctx);
}