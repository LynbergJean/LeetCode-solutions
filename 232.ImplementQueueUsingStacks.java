class MyQueue {
    private Stack<Integer> Stack1; // input stack
    private Stack<Integer> Stack2; // output stack
    
    public MyQueue() {
        Stack1 = new Stack<>();
        Stack2 = new Stack<>();
    }
    
    public void push(int x) {
        // Always push to Stack1
        Stack1.push(x);
    }
    
    public int pop() {
        // If Stack2 is empty, transfer all elements from Stack1
        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.pop());
            }
        }
        // Now pop from Stack2
        return Stack2.pop();
    }
    
    public int peek() {
        // If Stack2 is empty, transfer all elements from Stack1
        if (Stack2.isEmpty()) {
            while (!Stack1.isEmpty()) {
                Stack2.push(Stack1.pop());
            }
        }
        // Now peek from Stack2
        return Stack2.peek();
    }
    
    public boolean empty() {
        return Stack1.isEmpty() && Stack2.isEmpty();
    }
}