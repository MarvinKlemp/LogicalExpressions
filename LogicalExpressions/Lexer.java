package LogicalExpressions;

public class Lexer {
	public TokenStream analyse(String expression) throws LexingException {
		TokenStream tokens = new TokenStream();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			tokens.addToken(new Token(this.tokenClass(ch), ch));
		}

		return tokens;
	}

	private int tokenClass(char ch) throws LexingException {
		if (ch == '0' | ch == '1') {
			return Token.TOKEN_BOOLEAN;
		}

		if (ch == '*') {
			return Token.TOKEN_AND;
		}

		if (ch == '+') {
			return Token.TOKEN_OR;
		}

		if (ch == '!') {
			return Token.TOKEN_NOT;
		}

		if (ch == '(') {
			return Token.TOKEN_PARENTHESIS_OPEN;
		}

		if (ch == ')') {
			return Token.TOKEN_PARENTHESIS_CLOSE;
		}

		throw new LexingException();
	}
}
