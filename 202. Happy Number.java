class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> numbers = new HashSet<Integer>();
        int flag=1;
        while (n!=1){
            if (numbers.contains(n)){
                flag=0;
                break;
            }
            numbers.add(n);
            n=findnum(n);
        }
        if (flag==0){
            return false;
        }
        return true;
    }
    
    public int findnum(int n){
        int sum=0;
        while (n!=0){
            int a = n%10;
            sum+=(a*a);
            n=n/10;
        }
        return sum;
    }
}
