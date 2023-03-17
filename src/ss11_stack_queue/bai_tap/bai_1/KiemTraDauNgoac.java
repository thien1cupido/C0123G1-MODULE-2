package ss11_stack_queue.bai_tap.bai_1;

import java.util.Stack;

public class KiemTraDauNgoac {
        public static boolean checkParentheses(String expr) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < expr.length(); i++) {
                char c = expr.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String expr = "([]{})";
            System.out.println(checkParentheses(expr));
            expr = "([{]})";
            System.out.println(checkParentheses(expr));
        }
    }
