class MyStack {
    Queue<Integer> q;
    int top = -1;
    int size = 0;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i = 0; i < this.size; i++){
            q.add(q.poll());
        }
        size++;
        top = x;
    }
    
    public int pop() {

        if(size <= 0){
            return -1;
        }
        int popped = q.poll();
        size--;
        if(size == 0){
            top = -1;
        }
        else{
            top = q.peek();
        }
        return popped;

    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return size == 0;
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
