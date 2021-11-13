import java.util.Stack;

public class ValidatorOfBrackets {
    private Stack<Character> brackets = new Stack<>();

    public boolean isItOpenBracket(char bracket) {
        return "([{".indexOf(bracket) != -1;
    }

    public boolean isItClosedBracket(char bracket) {
        return ")]}".indexOf(bracket) != -1;
    }

    public boolean isPair(char open, char closed) {
        return open == '(' && closed == ')' || open == '[' && closed == ']' || open == '{' && closed == '}';
    }

    public boolean checkTheCorrectPlacementOfBrackets(String line) {
        for (char bracket : line.toCharArray()) {
            if (isItClosedBracket(bracket) && brackets.isEmpty()) {
                return false;
            }
            if (isItOpenBracket(bracket)) {
                brackets.push(bracket);
            }
            if (isItClosedBracket(bracket)) {
                if (isPair(brackets.peek(), bracket)) {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}