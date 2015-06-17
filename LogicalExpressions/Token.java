package LogicalExpressions;

public class Token {

	public static final int TOKEN_BOOLEAN = 0;
	public static final int TOKEN_AND = 1;
	public static final int TOKEN_OR = 2;
	public static final int TOKEN_NOT = 3;
	public static final int TOKEN_PARENTHESIS_OPEN = 4;
	public static final int TOKEN_PARENTHESIS_CLOSE = 5;

	public int tokenClass;
	public char representation;

	public Token(int tokenClass, char representation) {
		this.tokenClass = tokenClass;
		this.representation = representation;
	}
}
