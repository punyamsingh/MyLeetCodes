class Solution {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public String slope(int[] p1, int[] p2){
        int dy=(p1[1]-p2[1]);
        int dx=(p1[0]-p2[0]);
        int g=gcd(dy, dx);
        dy/=g;
        dx/=g;
        return dy+"/"+dx;
    }

    public int maxPoints(int[][] points) {
        int n=points.length;
        int gm=0;

        for (int i=0; i<n; i++){
            int[] fp = points[i];
            Map<String, Integer> map = new HashMap<>();
            int lm=0;
            for (int j=i+1; j<n; j++){
                int[] sp= points[j];
                String slp = slope(fp, sp);
                map.put(slp, map.getOrDefault(slp, 0)+1);
                
                lm=Math.max(lm, map.get(slp));

            }
            System.out.print(lm + " ");
            map=new HashMap<>();
            gm=Math.max(gm, lm);
        }

        return gm+1;
    }
}
