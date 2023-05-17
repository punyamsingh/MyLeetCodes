class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        L=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"]
        for x in s:
            if (x not in L):
                s=s.replace(x,"")
            # if (ord(x) not in range(97, 123) and ord(x) not in range(48, 58) ):
            #     s=s.replace(x,"")
        return s==s[::-1]
