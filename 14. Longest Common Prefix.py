class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
    
        longest = "" 
        for i in range(len(strs[0])): 
            for j in range(1, len(strs)): 
                if i > len(strs[j]) - 1 or strs[j][i] != strs[0][i]: 
                    return longest 
            longest += strs[0][i] 
        return longest
