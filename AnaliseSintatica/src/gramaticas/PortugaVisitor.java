// Generated from Portuga.g4 by ANTLR 4.7.1
package gramaticas;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PortugaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PortugaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PortugaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PortugaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(PortugaParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(PortugaParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#recordDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDec(PortugaParser.RecordDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#functionDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDec(PortugaParser.FunctionDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PortugaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PortugaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#varsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsSection(PortugaParser.VarsSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#varDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecList(PortugaParser.VarDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(PortugaParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#commandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandList(PortugaParser.CommandListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(PortugaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#singlecmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglecmd(PortugaParser.SinglecmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PortugaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(PortugaParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PortugaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PortugaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(PortugaParser.IndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PortugaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortugaParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(PortugaParser.ParamListContext ctx);
}