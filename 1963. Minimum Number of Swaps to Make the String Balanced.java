class Solution {
    public int minSwaps(String s) {
        int v=0;
        int m=0;
        for (char c: s.toCharArray()){
            if (c==']') v++;
            else if (c=='[') v--;
            
            m= Math.max(m,v);

        }

        return (m+1)/2;
    }
}
