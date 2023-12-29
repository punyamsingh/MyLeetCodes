// a better solution, not the best solution.
// definitely needs to be revisited.
class Solution {
    public double myPow(double x, int n) {
        if (n==1) return x;
        if (n==0) return 1;
        long n1=n;
        double ans = 1.0;
        if (n<0) n1=-n1;
        
        while (n1>0){
            if (n1%2==1){
                ans=ans*x;
                n1 = n1 - 1;
            }
            else{
                x=x*x;
                n1=n1/2;
            }
        }

        if (n<0) return (double) (1.0)/(ans);
        else return ans;
    }
}
