class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for (int i: nums){
            if (i==0){ z++;continue;}
            if (i==1){ o++;continue;}
            if (i==2){ t++;continue;}
        }
        int i;
        for (i=0; i<z; i++) nums[i]=0;
        for (i=z; i<z+o; i++) nums[i]=1;
        for (i=z+o; i<z+o+t; i++) nums[i]=2;
    }
}
