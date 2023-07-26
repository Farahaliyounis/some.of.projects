package ds.project;

class intStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public intStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int num) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = num;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}