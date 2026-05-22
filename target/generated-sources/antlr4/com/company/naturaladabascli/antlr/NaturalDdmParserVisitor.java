// Generated from com/company/naturaladabascli/antlr/NaturalDdmParser.g4 by ANTLR 4.9.3
package com.company.naturaladabascli.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NaturalDdmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NaturalDdmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#ddmFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdmFile(NaturalDdmParser.DdmFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#fileLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileLine(NaturalDdmParser.FileLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#ddmHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdmHeader(NaturalDdmParser.DdmHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#metaLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaLine(NaturalDdmParser.MetaLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#fieldLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLine(NaturalDdmParser.FieldLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(NaturalDdmParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptor(NaturalDdmParser.DescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalDdmParser#unknownLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownLine(NaturalDdmParser.UnknownLineContext ctx);
}