class Solution {
    public boolean isFascinating(int n) {
        if (n>333) return false;
        if (n%10 == 0 || n%10 == 5) return false;
        ArrayList<Integer> a = new ArrayList<Integer>();
        int p = (n*1000000) + (n*2000) + (n*3);
        if (p>987654321) return false;
        
        while (p!=0){
            int m = p%10;
            if (m==0) return false;
            if (a.contains(m)) return false;
            a.add(m);
            p=p/10;
        }
        
        return (a.size() == 9);
    }
}
