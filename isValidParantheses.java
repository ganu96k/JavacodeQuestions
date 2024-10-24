import java.util.Stack;

public class isValidParantheses {

    public static boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() && !isMatching(stack.pop(), c)) 
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '{' && close == '}' ||
                open == '[' && close == ']');
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()")); // true
        System.out.println(isValidParentheses("({[]})"));
        System.out.println(isValidParentheses("()")); // true
        System.out.println(isValidParentheses("({[]})")); // true
        System.out.println(isValidParentheses("({[})")); // false
        System.out.println(isValidParentheses("((()))")); // true
        System.out.println(isValidParentheses("")); // true
    }
}
