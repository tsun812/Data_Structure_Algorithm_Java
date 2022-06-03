//O(1) push, pop. top, getMin, O(n) space.
class MinStack {
    private int length;
    private int minLength;
    public ArrayList<Integer> array;
    public ArrayList<Integer> min;
    public MinStack() {
        array = new ArrayList<Integer>();
        min = new ArrayList<Integer>();
        length = -1;
        minLength = -1;
    }
    
    public void push(int val) {
        if(min.isEmpty()){
            min.add(val);
            minLength++;
        }
        else if(val <= min.get(minLength)){
            min.add(val);
            minLength++;
        }
        array.add(val);
        length++;
    }
    
    public void pop() {
        if (min.get(minLength).equals(array.get(length))){
            min.remove(minLength);
            minLength--;
        }
        array.remove(length);
        
        length--;
    }
    
    public int top() {
        return array.get(length);
    }
    
    public Integer getMin() {
        if(min.isEmpty()) {
            return null;
        }
         return min.get(minLength);
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