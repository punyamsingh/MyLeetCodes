class Solution {
    float m;
    int n;
    int[] fp = new int[2];
    int[] sp = new int[2];

    public boolean checkStraightLine(int[][] coordinates) {
        n = coordinates.length;
        if (coordinates.length==2){
            return true;
        }
        fp[0] = coordinates[0][0];
        fp[1] = coordinates[0][1];
        sp[0] = coordinates[1][0];
        sp[1] = coordinates[1][1];
        
        if (sp[0]-fp[0] == 0){
            int j=0;
            while (fp[0] == coordinates[j++][0] && j<n);
            return coordinates[j-1][0] == fp[0];
        }

        if (sp[1]-fp[1] == 0){
            int j=0;
            while (fp[1] == coordinates[j++][1] && j<n);
            return coordinates[j-1][1] == fp[1];
        }
        
        m = (float)(sp[1]-fp[1])/(sp[0]-fp[0]);
        // System.out.println("m is "+m);
        int i=2;
        while ((inline(coordinates[i++],fp)) && i<n);
        return inline(coordinates[i-1],fp);
    }

    public boolean inline(int[] coor, int[] com){
        return (float)(com[1]-coor[1])/(com[0]-coor[0]) - m == 0;
    }
}
