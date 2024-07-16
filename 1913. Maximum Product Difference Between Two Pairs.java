class Solution {
    public int maxProductDifference(int[] nums) {
        int a=0, b=0;
        int c=Integer.MAX_VALUE, d=Integer.MAX_VALUE;

        for (int i: nums){
            if (i>=a){
                b=a;
                a=i;
            }
            else if (i>b) b=i;
            
            if (i<=c){
                d=c;
                c=i;
            }
            else if (i<d) d=i;
        }

        return (a * b) - (c * d);
    }
}
