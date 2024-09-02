class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for (int i: chalk) sum+=i;

        long r=k%sum;

        for (int i=0; i<chalk.length; i++){
            if (r-chalk[i]<0) return i;
            r-=chalk[i];
        }
        return 0;
    }
}
