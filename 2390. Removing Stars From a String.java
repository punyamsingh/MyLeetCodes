class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int k=0;
        for (char i: s.toCharArray()){
            if (i!='*'){
                stack.push(i);
                k++;
            }
            else{
                stack.pop();
                k--;
            }
        }
        char[] c = new char[k];
        while (k!=0){
            c[--k]=stack.pop();
        }
        return new String(c);
    }
}
