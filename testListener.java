// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#fullName}.
	 * @param ctx the parse tree
	 */
	void enterFullName(testParser.FullNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#fullName}.
	 * @param ctx the parse tree
	 */
	void exitFullName(testParser.FullNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#contact}.
	 * @param ctx the parse tree
	 */
	void enterContact(testParser.ContactContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#contact}.
	 * @param ctx the parse tree
	 */
	void exitContact(testParser.ContactContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#addressline}.
	 * @param ctx the parse tree
	 */
	void enterAddressline(testParser.AddresslineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#addressline}.
	 * @param ctx the parse tree
	 */
	void exitAddressline(testParser.AddresslineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#gender}.
	 * @param ctx the parse tree
	 */
	void enterGender(testParser.GenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#gender}.
	 * @param ctx the parse tree
	 */
	void exitGender(testParser.GenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#details}.
	 * @param ctx the parse tree
	 */
	void enterDetails(testParser.DetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#details}.
	 * @param ctx the parse tree
	 */
	void exitDetails(testParser.DetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(testParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(testParser.ListContext ctx);
}