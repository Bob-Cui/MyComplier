// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/Learn\Learn.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LearnParser}.
 */
public interface LearnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LearnParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LearnParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LearnParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LearnParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LearnParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LearnParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LearnParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LearnParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LearnParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LearnParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LearnParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LearnParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LearnParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LearnParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LearnParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LearnParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LearnParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LearnParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LearnParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LearnParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LearnParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LearnParser.IntContext ctx);
}