class Solution:
    def capitalizeTitle(self, title: str) -> str:
        L=title.split()
        L2=[]
        for x in L:
            if len(x)<3:
                L2.append(x.lower())
            else:
                L2.append(x[0].upper() + x[1:].lower())
        return " ".join(e for e in L2)
