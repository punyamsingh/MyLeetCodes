class Solution:
    def maximumCostSubstring(self, s: str, chars: str, vals: List[int]) -> int:
        
        v={chr(i).lower():i-64 for i in range(65,91)}
        # print(v)
        for x in range(len(vals)):
            v[chars[x]]=vals[x]
        
        # cost=0
        # for y in range(len(s)):
        #     cost+=di[y]
            
        maxCost = 0
        curCost = 0
        for i in range(len(s)):
            # if s[i] in di:
            #     curCost += di[s[i]]
            # else:
            #     curCost += ord(s[i]) - ord('a') + 1
            curCost+=v[s[i]]
            maxCost = max(maxCost, curCost)
            curCost = max(curCost, 0)
        return maxCost
