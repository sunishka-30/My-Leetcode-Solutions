class MinStack {
    long min=Integer.MAX_VALUE;
    Stack<Long> s = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(s.size()==0)
        {
            s.push((long)val);
                min=val;
        }
        else{
            if(val>=min)
                s.push((long)val);
            else if(val<min)
            {
                s.push((long)2*val-min);
                min=val; 
            }
        }
    }
    
    public void pop() {
        if(s.size()==0)
            return ;
        else
        {
            if(s.peek()>=min)
                s.pop();
            else if(s.peek()<min)
            { min = 2*min - s.peek();
                s.pop();}
        }
    }
    
    public int top() {
        if(s.size()==0)
            return -1;
        else{
            if(s.peek()>=min)
                return s.peek().intValue();
            else  
                return (int)min;
        }
    }
    
    public int getMin() {
        if(s.size()==0)
            return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
