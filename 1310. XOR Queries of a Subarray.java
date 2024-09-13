class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] l = new int[n];
        int[] r = new int[n];

        l[0]=arr[0];
        for (int i=1; i<n; i++){
            l[i]=l[i-1]^arr[i];
        }

        r[n-1]=arr[n-1];
        for (int i=n-2; i>=0; i--){
            r[i]=r[i+1]^arr[i];
        }

        int m=queries.length;
        int[] res = new int[m];
        int t=r[0];
        for (int i=0; i<m; i++){
            int s=queries[i][0];
            int e=queries[i][1];
            if (s-e==0){
                res[i]=arr[s];
                continue;
            }
            res[i]=t;
            if (s>0){
                res[i]^=l[s-1];
            }
            if (e<n-1){
                res[i]^=r[e+1];
            }
        }
        return res;
    }
}
