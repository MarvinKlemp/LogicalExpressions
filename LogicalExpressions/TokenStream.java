package LogicalExpressions;

import java.util.ArrayList;
import java.util.List;

public class TokenStream {

	private List<Token> list;

	public TokenStream() {
		this.list = new ArrayList<Token>();
	}

	public void addToken(Token t) {
		this.list.add(t);
	}

	public String toString() {
		String s = "";

		for (Token t : this.list) {
			s += t.representation;
		}

		return s;
	}
}
