class MyStack {
    
    Queue<Integer> queue_1 = new LinkedList();
    Queue<Integer> queue_2 = new LinkedList();

    public MyStack() {
        
    }
    
    public void push(int x) {
        queue_2.add(x);
        while (!queue_1.isEmpty()) {
            queue_2.add(queue_1.peek());
            queue_1.remove();
        }
        
        Queue<Integer> queue = queue_2;
        queue_2 = queue_1;
        queue_1 = queue;
    }
    
    public int pop() {
        return queue_1.remove();
    }
    
    public int top() {
        return queue_1.peek();
    }
    
    public boolean empty() {
        return queue_1.isEmpty() && queue_2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */