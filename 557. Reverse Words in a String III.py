class Solution:
    def reverseWords(self, s: str) -> str:
        L=s.split(" ")
        L2=[x[::-1] for x in L]
        return ' '.join(str(e) for e in L2)
        
