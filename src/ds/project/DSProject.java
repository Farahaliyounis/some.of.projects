package ds.project;

public class DSProject {

    public static void main(String[] args) {
//        String exp = "a+b*(c^d-e)^(f+g*h)-i";
//        System.out.println("Infix Expression: " + exp);
//        System.out.println("Postfix Expression: " + InfixToPostfix.infixToPostfix(exp));

        System.out.println("---------------------------------------------------------");

        String exp2 = "3*(4+5)-6/(1+2)";
        System.out.println("Postfix Expression: " + exp2);
         System.out.println("Postfix Expression: " + InfixToPostfix.infixToPostfix(exp2));
        System.out.println("Result: " + PostfixEvaluator.evaluatePostfix(exp2));
    }

}
