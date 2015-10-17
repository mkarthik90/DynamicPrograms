import java.util.Stack;

public class SimpleParser {

	public boolean parser(String arr) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < arr.length(); i++) {
			Character character = arr.charAt(i);
			if (character.equals('{') || character.equals('(')) {
				stack.push(character);
			}

			else if (character.equals('}')) {
				if (!(stack.pop().equals('{'))) {
					return false;
				}
			}

			else if (character.equals(')')) {
				if (!(stack.pop().equals('('))) {
					return false;
				}
			}

			else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		// This parser method validates if the brackets have been opened and
		// closed correctly
		// For example {{}} ({}) {()} ({{{}}}) are all valid
		// Invalid {(}) {{{))) {({)}

		SimpleParser parser = new SimpleParser();
		System.out.println(parser.parser("{{}}"));
		System.out.println(parser.parser("{(})"));
		System.out.println(parser.parser("{{{)))"));
	}

}
