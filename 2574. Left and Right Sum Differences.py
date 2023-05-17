class Solution:
    def leftRigthDifference(self, nums: List[int]) -> List[int]:
        t=sum(nums)
        L=[]
        r=t-nums[0]
        l=nums[0]
        L.append(r)
        for x in range(1,len(nums)-1):
            r-=nums[x]
            L.append(abs(l-r))
            l+=nums[x]
        L.append(l)
        return L[:len(nums)]
            
