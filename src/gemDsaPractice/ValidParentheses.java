package gemDsaPractice;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        // make a stack of characters
        Stack<Character> stack = new Stack<>();

        // traverse through the String s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if it's an opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // if it's a closing bracket
            else {
                // check if stack is empty
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // check matching
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // at the end, stack must be empty
        return stack.isEmpty();
    }
}
