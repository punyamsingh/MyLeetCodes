class Solution {

    class Job{
        int difficulty, profit;
        public Job(int a, int b){
            this.difficulty=a;
            this.profit=b;
        }

    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        Arrays.sort(worker);
        Job[] jobs = new Job[n];
        for (int i=0; i<n; i++){
            jobs[i] = new Job(difficulty[i], profit[i]);
        }
        Arrays.sort(jobs, (job1, job2) -> Integer.compare(job1.difficulty, job2.difficulty));

        int j=0;
        int ans=0;
        int mp=0;
        for (int w: worker){
            while (j<n && jobs[j].difficulty<=w){
                mp=Math.max(mp, jobs[j].profit);
                j++;
            }
            ans+=mp;
        }
        return ans;
    }
}
