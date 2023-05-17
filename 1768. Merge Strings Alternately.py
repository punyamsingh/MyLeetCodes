class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        a=""
        b=min(len(word1),len(word2))
        for i in range(b):
            a+=word1[i]
            a+=word2[i]
        if (len(word2)>len(word1)):
            a+=word2[b::]
        else:
            a+=word1[b::]
        return a
