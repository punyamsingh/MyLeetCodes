class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int ans=0;
        for (int i=0; i<n; i++){
            int x=arr[i];
            for (int j=i+1; j<n; j++){
                x=x^arr[j];
                if (x==0) ans+=(j-i);
            }
        }
        return ans;
    }
}
