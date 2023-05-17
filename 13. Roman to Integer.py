 class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        symvalue={"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
        sum=0
        add=0
        skip=0
        for i in range(len(s)-1, -1, -1):
            if (skip==1):
                skip=0
                continue
            
            if (s[i]=="I"):
                add=1
            if (s[i]=="V"):
                add=5
            if (s[i]=="X"):
                add=10
            if (s[i]=="L"):
                add=50
            if (s[i]=="C"):
                add=100
            if (s[i]=="D"):
                add=500
            if (s[i]=="M"):
                add=1000
            
            if (i!=0):
                if (s[i-1]=="I" and (s[i]=="V" or s[i]=="X")):
                    add=add-1
                    skip=1
                elif (s[i-1]=="X" and (s[i]=="L" or s[i]=="C")):
                    add=add-10
                    skip=1
                elif (s[i-1]=="C" and (s[i]=="D" or s[i]=="M")):
                    add=add-100
                    skip=1
            
            sum+=add
            print(sum, add)
        return sum
