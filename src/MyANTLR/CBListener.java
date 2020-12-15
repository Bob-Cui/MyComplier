// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.9
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
	 * Enter a parse tree produced by {@link CBParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CBParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CBParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(CBParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(CBParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CBParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CBParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfexpr(CBParser.IfexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfexpr(CBParser.IfexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#forexpr}.
	 * @param ctx the parse tree
	 */
	void enterForexpr(CBParser.ForexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#forexpr}.
	 * @param ctx the parse tree
	 */
	void exitForexpr(CBParser.ForexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#autocCacu}.
	 * @param ctx the parse tree
	 */
	void enterAutocCacu(CBParser.AutocCacuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#autocCacu}.
	 * @param ctx the parse tree
	 */
	void exitAutocCacu(CBParser.AutocCacuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#funtions}.
	 * @param ctx the parse tree
	 */
	void enterFuntions(CBParser.FuntionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#funtions}.
	 * @param ctx the parse tree
	 */
	void exitFuntions(CBParser.FuntionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(CBParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(CBParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CBParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CBParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CBParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CBParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#listype}.
	 * @param ctx the parse tree
	 */
	void enterListype(CBParser.ListypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#listype}.
	 * @param ctx the parse tree
	 */
	void exitListype(CBParser.ListypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#numlist}.
	 * @param ctx the parse tree
	 */
	void enterNumlist(CBParser.NumlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#numlist}.
	 * @param ctx the parse tree
	 */
	void exitNumlist(CBParser.NumlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(CBParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(CBParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CBParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CBParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(CBParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(CBParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#idlist}.
	 * @param ctx the parse tree
	 */
	void enterIdlist(CBParser.IdlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#idlist}.
	 * @param ctx the parse tree
	 */
	void exitIdlist(CBParser.IdlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#idlist2}.
	 * @param ctx the parse tree
	 */
	void enterIdlist2(CBParser.Idlist2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#idlist2}.
	 * @param ctx the parse tree
	 */
	void exitIdlist2(CBParser.Idlist2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(CBParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(CBParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CBParser#jump_stat}.
	 * @param ctx the parse tree
	 */
	void enterJump_stat(CBParser.Jump_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link CBParser#jump_stat}.
	 * @param ctx the parse tree
	 */
	void exitJump_stat(CBParser.Jump_statContext ctx);
}