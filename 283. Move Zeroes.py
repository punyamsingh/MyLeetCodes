class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        nonzeros=0
        for x in range(len(nums)):
            if (nums[x] != 0):
                # a=nums.pop(x)
                nums.insert(nonzeros, nums.pop(x))
                nonzeros+=1
                # for y in range()
