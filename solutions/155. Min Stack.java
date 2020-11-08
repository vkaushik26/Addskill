class MinStack {
​
    public Stack<ArrayList<Integer>> myStack;
    public int min;
    /** initialize your data structure here. */
    public MinStack() {
        myStack = new Stack<ArrayList<Integer>>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
          ArrayList<Integer> insert = new ArrayList<Integer>();
          insert.add(x);
          min = Math.min(x, min);
          insert.add(min);
          myStack.push(insert);
    }
    
    public void pop() {
         myStack.pop();
        if(!myStack.isEmpty()) {
            min = myStack.peek().get(1);
        } else {
            min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return myStack.peek().get(0);
    }
    
    public int getMin() {
     return min;   
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
