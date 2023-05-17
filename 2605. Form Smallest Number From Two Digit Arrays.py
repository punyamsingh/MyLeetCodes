class Solution(object):
    def minNumber(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        
#         s=set()
#         s.add(min(nums1))
#         s.add(min(nums2))
        

#         L=[min(nums1), min(nums2)]
        
#         if 
        
        
        # if (min(nums1)==min(nums2)):
        #     return min(nums1)
        a=str(min(nums1))
        b=str(min(nums2))
        # x=min(a,b)*len(str(max(a,b))) + max(a,b)
        x=min(int(a+b), int(b+a))
        try:
            c=min(list(set(nums1).intersection(nums2)))
        except ValueError:
            return x
        return min(c,x)
        # return min(int(str(min(nums1))+str(min(nums2))), int(str(min(nums2))+str(min(nums1))))
        
