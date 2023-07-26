package ds.project;

public class InfixToPostfix {

    public static String infixToPostfix(String infix) {
        int len = infix.length();
        charStack stack = new charStack(len);
        StringBuilder postfix = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    while (!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    postfix.append(ch);
                    break;
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static int priority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

}
