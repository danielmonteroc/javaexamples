package java8.fun.stuff;


import java.util.Stack;

public class Parser {
    private Stack<Character> stack = new Stack<>();

    public boolean isBalanced(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }
}