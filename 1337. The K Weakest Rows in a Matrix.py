class Solution(object):
    def kWeakestRows(self, mat, k):
             
        soldiers=[mat[i].count(1) for i in range(len(mat))]
        output=[]
        j=0;
        while (j<k):
            m=soldiers.index(min(soldiers))
            output.append(m)
            soldiers[m]=1000
            j+=1
        return output
