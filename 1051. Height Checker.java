class Solution {
    public int heightChecker(int[] heights) {
        // int n = Arrays.stream(heights).max().getAsInt();
        int[] freq = new int[101];

        for (int i: heights){
            freq[i]++;
        }

        int k=0;
        int ans=0;
        for (int j=0; j<heights.length; j++){
            while (freq[k]==0){
                k++;
            }
            if (heights[j]!=k){
                ans++;
            }
            freq[k]--;
        }

        return ans;   
    }
}
