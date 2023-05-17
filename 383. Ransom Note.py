class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        
        for x in ransomNote:
            if x in magazine:
                magazine=magazine.replace(x,"",1)
            else:
                return False
        return True
