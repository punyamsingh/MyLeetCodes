class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> ans = new ArrayList<>();

        if (n==0) return ans;
        if (n==1) {
            List<Integer> fr = new ArrayList<>();
            fr.add(1);
            ans.add(fr);
            return ans;
        }

        ans=generate(numRows-1);
        List<Integer> prev = ans.get(n-2);
        List<Integer> curr = new ArrayList<>();

        curr.add(1);
        for (int i=1; i<n-1; i++){
            curr.add(prev.get(i-1)+prev.get(i));
        }
        curr.add(1);
        ans.add(curr);
        return ans;
    }
}
