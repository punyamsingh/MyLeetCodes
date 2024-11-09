class Solution {
    public int smallestNumber(int n, int t) {
        int prod=1;
        int a=n;
        while (a!=0){
            prod*=(a%10);
            a/=10;
        }

        while (prod%t!=0){
            n++;
            if (n%10==0){
                prod=0;
            }
            else if (n%10==1){
                continue;
            }
            else{
                prod=(prod / ((n-1)%10) )*(n%10);
            }
            // int c=(prod / ((n-1)%10) )*(n%10)
        }
        return n;
    }
}
