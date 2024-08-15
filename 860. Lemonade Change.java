class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[3];
        for (int i: bills){
            if (i==5) change[0]++;
            if (i==10) change[1]++;
            if (i==20) change[2]++;

            if (i==10){
                if (change[0]>0){
                    change[0]--;
                }
                else{
                    return false;
                }
            }
            if (i==20){
                if (change[1]>0 && change[0]>0){
                    change[0]--;
                    change[1]--;
                }
                else if (change[0]>2){
                    change[0]--;
                    change[0]--;
                    change[0]--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
