class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the input array to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Start with the empty subset

        int start, end = 0; // Initialize end here
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = result.size() - 1;

            int size = result.size();
            for (int j = start; j < size; j++) {
                List<Integer> currentSubset = new ArrayList<>(result.get(j));
                currentSubset.add(nums[i]);
                result.add(currentSubset);
            }
        }

        return result;
    }
}
