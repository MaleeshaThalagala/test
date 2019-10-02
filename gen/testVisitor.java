// Generated from /home/maleesha/Downloads/antlrtest/test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#firstName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstName(testParser.FirstNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#lastName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastName(testParser.LastNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#addressline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressline(testParser.AddresslineContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#contact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContact(testParser.ContactContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#fullname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullname(testParser.FullnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#details}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetails(testParser.DetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(testParser.ListContext ctx);
}