package MyAntlr;// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CBParser}.
 */
public interface CBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CBParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CBParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CBParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CBParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CBParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CBParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CBParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CBParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CBParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CBParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CBParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CBParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CBParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CBParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CBParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(CBParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(CBParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CBParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CBParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CBParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CBParser.IntContext ctx);
}