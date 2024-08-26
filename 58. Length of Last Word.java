class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int x=0;
        int a=0;
        for (int i=n-1; i>=0; i--){
            if (s.charAt(i)!=' '){
                a=i;
                break;
            }
        }
        for (int i=a; i>=0; i--){
            if (s.charAt(i)==' ') return x;
            x++;
        }
        return x;
    }
}
