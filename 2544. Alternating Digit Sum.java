class Solution {
    public int alternateDigitSum(int n) {
        int digits=(n+"").length();
        int sign;
        int sum=0;
        if (digits%2==0){
            for (sign=-1; n!=0; sign*=(-1)){
                sum+= (sign * (n%10));
                n=n/10;
            }
        }
        for (sign=1; n!=0; sign*=(-1)){
            sum+= (sign * (n%10));
            n=n/10;
        }
        
        return sum;
    }
}
