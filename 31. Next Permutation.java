class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = nums.length - 2;
        
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }
        
        if (pivot == -1) {
            reverseArray(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    swap(nums, pivot, i);
                    break;
                }
            }
            reverseArray(nums, pivot + 1, nums.length - 1);
        }
    }

    public void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
