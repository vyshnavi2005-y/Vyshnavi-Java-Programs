public class MyStack {
    private int maxSize;
    private int[] stack;
    private int top;
    public MyStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty() {
        return top == -1;
    public int size() {
        return top + 1;
    }
}
