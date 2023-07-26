
package ds.project;

class charStack {
    private int maxSize;
    private char[] stackArray;
    private int top;
 
    public charStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }
 
    public void push(char ch) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = ch;
    }
 
    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return stackArray[top--];
    }
 
    public char peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return stackArray[top];
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
}