// Generated from C:/Users/DELL/Desktop/WebForContest/Complier/src/MyANTLR\CB.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CBParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CBVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CBParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CBParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CBParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#statlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatlist(CBParser.StatlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CBParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(CBParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#forexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForexpr(CBParser.ForexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#autocCacu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutocCacu(CBParser.AutocCacuContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#funtions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntions(CBParser.FuntionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormals(CBParser.FormalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(CBParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CBParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#listype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListype(CBParser.ListypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#numlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumlist(CBParser.NumlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#mulexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexpr(CBParser.MulexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CBParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(CBParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#idlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlist(CBParser.IdlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#idlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlist2(CBParser.Idlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(CBParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CBParser#jump_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_stat(CBParser.Jump_statContext ctx);
}