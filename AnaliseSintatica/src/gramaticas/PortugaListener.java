// Generated from Portuga.g4 by ANTLR 4.7.1
package gramaticas;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortugaParser}.
 */
public interface PortugaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortugaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PortugaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PortugaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(PortugaParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(PortugaParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PortugaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PortugaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#recordDec}.
	 * @param ctx the parse tree
	 */
	void enterRecordDec(PortugaParser.RecordDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#recordDec}.
	 * @param ctx the parse tree
	 */
	void exitRecordDec(PortugaParser.RecordDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDec(PortugaParser.FunctionDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDec(PortugaParser.FunctionDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PortugaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PortugaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PortugaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PortugaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#varsSection}.
	 * @param ctx the parse tree
	 */
	void enterVarsSection(PortugaParser.VarsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#varsSection}.
	 * @param ctx the parse tree
	 */
	void exitVarsSection(PortugaParser.VarsSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#varDecList}.
	 * @param ctx the parse tree
	 */
	void enterVarDecList(PortugaParser.VarDecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#varDecList}.
	 * @param ctx the parse tree
	 */
	void exitVarDecList(PortugaParser.VarDecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(PortugaParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(PortugaParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#commandList}.
	 * @param ctx the parse tree
	 */
	void enterCommandList(PortugaParser.CommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#commandList}.
	 * @param ctx the parse tree
	 */
	void exitCommandList(PortugaParser.CommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(PortugaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(PortugaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#singlecmd}.
	 * @param ctx the parse tree
	 */
	void enterSinglecmd(PortugaParser.SinglecmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#singlecmd}.
	 * @param ctx the parse tree
	 */
	void exitSinglecmd(PortugaParser.SinglecmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PortugaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PortugaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(PortugaParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(PortugaParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PortugaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PortugaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PortugaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PortugaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(PortugaParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(PortugaParser.IndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PortugaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PortugaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(PortugaParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(PortugaParser.ParamListContext ctx);
}