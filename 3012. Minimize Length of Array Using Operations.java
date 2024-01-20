class Solution {
    public int minimumArrayLength(int[] nums) {
        if (nums.length <= 2) return 1;

        int minElement = Arrays.stream(nums).min().orElse(0);
        long countMin = Arrays.stream(nums).filter(num -> num == minElement).count();

        if (countMin == 1) return 1;

        for (int num : nums) {
            if (num % minElement != 0) return 1;
        }

        return (int) ((countMin + 1) / 2);
    }
}
