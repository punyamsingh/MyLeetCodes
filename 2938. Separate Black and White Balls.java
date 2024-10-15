class Solution {
    public long minimumSteps(String s) {
        int count =0;
        long res=0;
        for (int i=0; i<s.length(); i++){
            char t = s.charAt(i);

            if (t=='1'){
                count++;
            }
            else{
                res+=count;
            }
        }

        return res;
    }
}
