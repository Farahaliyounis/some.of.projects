package ds.project;

public class PostfixEvaluator {

  
    static int evaluatePostfix(String expression) {
        int len = expression.length();
        intStack stack = new intStack(len);

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i); 
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }  
            else {
                int secondope = stack.pop();
                int firstope = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(firstope+ secondope);
                        break;
                    case '-':
                        stack.push(firstope -secondope );
                        break;
                    case '*':
                        stack.push(firstope * secondope);
                        break;
                    case '/':
                        stack.push(firstope/ secondope);
                        break;
                    case '^':
                        stack.push((int) Math.pow(firstope,secondope ));
                        break;
                }
            }
        }
        return stack.pop();
    }
}
