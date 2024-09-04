class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x=0, y=0, d=0;
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int res=0;
        Set<String> obs = new HashSet<>();
        for (int[] o: obstacles){
            obs.add(o[0]+","+o[1]);
        }
        for (int com: commands){
            if (com==-1) d=(d+1)%4;
            else if (com==-2) d=(d+3)%4;
            else{
                int dx=dir[d][0], dy=dir[d][1];
                for (int t=0; t<com; t++){
                    if (obs.contains((x+dx)+","+(y+dy))) break;
                    x+=dx;
                    y+=dy;
                }
            }
            res = Math.max(res, x*x+y*y);
        }

        return res;
    }
}
