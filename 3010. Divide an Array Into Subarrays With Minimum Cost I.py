class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        sum=nums[0]
        L=sorted(nums[1::])
        sum+=L[0]
        sum+=L[1]
        return sum
