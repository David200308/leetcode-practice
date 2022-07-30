class MyQueue {
    
    Stack<Integer> stack_1 = new Stack();
    Stack<Integer> stack_2 = new Stack();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stack_1.empty()) {
            stack_2.push(stack_1.pop());
        }
        stack_1.push(x);

        while(!stack_2.empty()) {
            stack_1.push(stack_2.pop());
        }
    }
    
    public int pop() {
        return stack_1.pop();
    }
    
    public int peek() {
        return stack_1.peek();
    }
    
    public boolean empty() {
        return stack_1.empty() && stack_2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */