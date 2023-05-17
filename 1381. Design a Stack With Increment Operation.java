class CustomStack {

    int[] stack;
    int top=0;
    int max;

    public CustomStack(int maxSize) {
        this.stack=new int[maxSize];
        this.max=maxSize;
    }
    
    public void push(int x) {
        if (this.top==this.max) return;
        stack[this.top++] = x;
    }
    
    public int pop() {
        if(this.top==0){
            return -1;
        }
        return stack[--this.top];
    }
    
    public void increment(int k, int val) {
        if(k > this.top){
            for (int i=0; i<max ; i++){
                stack[i]+=val;
            }
        }
        else{
            for (int i=0; i<k ;i++){
                stack[i]+=val;
            }
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
