package ru.gaidamaka.jvm.lang.antlr4;// Generated from bokl.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link boklParser}.
 */
public interface boklListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link boklParser#gotoOperation}.
	 * @param ctx the parse tree
	 */
	void enterGotoOperation(@NotNull boklParser.GotoOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#gotoOperation}.
	 * @param ctx the parse tree
	 */
	void exitGotoOperation(@NotNull boklParser.GotoOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#compareInt}.
	 * @param ctx the parse tree
	 */
	void enterCompareInt(@NotNull boklParser.CompareIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#compareInt}.
	 * @param ctx the parse tree
	 */
	void exitCompareInt(@NotNull boklParser.CompareIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull boklParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull boklParser.WhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#strVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStrVarDeclaration(@NotNull boklParser.StrVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#strVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStrVarDeclaration(@NotNull boklParser.StrVarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#compareStr}.
	 * @param ctx the parse tree
	 */
	void enterCompareStr(@NotNull boklParser.CompareStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#compareStr}.
	 * @param ctx the parse tree
	 */
	void exitCompareStr(@NotNull boklParser.CompareStrContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#strVarAssign}.
	 * @param ctx the parse tree
	 */
	void enterStrVarAssign(@NotNull boklParser.StrVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#strVarAssign}.
	 * @param ctx the parse tree
	 */
	void exitStrVarAssign(@NotNull boklParser.StrVarAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull boklParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull boklParser.IncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#intVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntVarDeclaration(@NotNull boklParser.IntVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#intVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntVarDeclaration(@NotNull boklParser.IntVarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull boklParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull boklParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull boklParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull boklParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull boklParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull boklParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull boklParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull boklParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#intRValue}.
	 * @param ctx the parse tree
	 */
	void enterIntRValue(@NotNull boklParser.IntRValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#intRValue}.
	 * @param ctx the parse tree
	 */
	void exitIntRValue(@NotNull boklParser.IntRValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull boklParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull boklParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull boklParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull boklParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#strRValue}.
	 * @param ctx the parse tree
	 */
	void enterStrRValue(@NotNull boklParser.StrRValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#strRValue}.
	 * @param ctx the parse tree
	 */
	void exitStrRValue(@NotNull boklParser.StrRValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#intVarAssign}.
	 * @param ctx the parse tree
	 */
	void enterIntVarAssign(@NotNull boklParser.IntVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#intVarAssign}.
	 * @param ctx the parse tree
	 */
	void exitIntVarAssign(@NotNull boklParser.IntVarAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#gotoLabel}.
	 * @param ctx the parse tree
	 */
	void enterGotoLabel(@NotNull boklParser.GotoLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#gotoLabel}.
	 * @param ctx the parse tree
	 */
	void exitGotoLabel(@NotNull boklParser.GotoLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull boklParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull boklParser.CodeBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link boklParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperation(@NotNull boklParser.CompareOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link boklParser#compareOperation}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperation(@NotNull boklParser.CompareOperationContext ctx);
}