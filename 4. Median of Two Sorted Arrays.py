class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums3=sorted(nums1+nums2)
        # print(nums3)
        l=len(nums3)
        if (l==1):
            return nums3[0]
        elif (l%2==0):
            return (nums3[l/2-1] + nums3[l/2])/2.0
        else:
            return (nums3[l/2])
