package base;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedParentheses {

    static boolean validParentheses(String parentheses) {
        if (parentheses == null || parentheses.length() == 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }

            else if (stack.isEmpty()) {
                return false;
            }

            else {
                if (c == '}' && stack.peek() == '{') stack.pop();
                else if (c == ']' && stack.peek() == '[') stack.pop();
                else if (c == ')' && stack.peek() == '(') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String parentheses = "[(])";
        boolean valid = validParentheses(parentheses);
        System.out.println(valid);
    }
}
