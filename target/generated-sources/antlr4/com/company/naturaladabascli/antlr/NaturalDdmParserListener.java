// Generated from com/company/naturaladabascli/antlr/NaturalDdmParser.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NaturalDdmParser}.
 */
public interface NaturalDdmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#ddmFile}.
	 * @param ctx the parse tree
	 */
	void enterDdmFile(NaturalDdmParser.DdmFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#ddmFile}.
	 * @param ctx the parse tree
	 */
	void exitDdmFile(NaturalDdmParser.DdmFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#fileLine}.
	 * @param ctx the parse tree
	 */
	void enterFileLine(NaturalDdmParser.FileLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#fileLine}.
	 * @param ctx the parse tree
	 */
	void exitFileLine(NaturalDdmParser.FileLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#ddmHeader}.
	 * @param ctx the parse tree
	 */
	void enterDdmHeader(NaturalDdmParser.DdmHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#ddmHeader}.
	 * @param ctx the parse tree
	 */
	void exitDdmHeader(NaturalDdmParser.DdmHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#metaLine}.
	 * @param ctx the parse tree
	 */
	void enterMetaLine(NaturalDdmParser.MetaLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#metaLine}.
	 * @param ctx the parse tree
	 */
	void exitMetaLine(NaturalDdmParser.MetaLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#fieldLine}.
	 * @param ctx the parse tree
	 */
	void enterFieldLine(NaturalDdmParser.FieldLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#fieldLine}.
	 * @param ctx the parse tree
	 */
	void exitFieldLine(NaturalDdmParser.FieldLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(NaturalDdmParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(NaturalDdmParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor(NaturalDdmParser.DescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor(NaturalDdmParser.DescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NaturalDdmParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void enterUnknownLine(NaturalDdmParser.UnknownLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NaturalDdmParser#unknownLine}.
	 * @param ctx the parse tree
	 */
	void exitUnknownLine(NaturalDdmParser.UnknownLineContext ctx);
}