class CustomStack {
    private int[] stk;
    private int top;

    public CustomStack(int maxSize) {
        stk = new int[maxSize];
        top=-1;
        
        
    }
    
    public void push(int x) {
        if(top==stk.length - 1){
            System.out.println("Can't since Array full.");
        
        }

        else stk[++top] = x;
        
    }
    
    public int pop() {
        if(top==-1) return -1;
        return stk[top--];
        
    }
    
    public void increment(int k, int val) {
        if(k>stk.length){
            for(int i = 0; i < stk.length; i++){
                stk[i]+=val;
            }
        }
        else 
            for(int i = 0; i < k; i++){
                stk[i]+=val;
            }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */