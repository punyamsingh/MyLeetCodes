class Solution {
    public int minimumSum(int num) {
        int[] nu = new int[4];
        int i=0;
        while (num!=0){
            nu[i++]=num%10;
            num=num/10;
        }

        for(i=1;i<4;i++){
		    int b = i-1;
		    int key = nu[i];
		    while(b>=0 && nu[b]>key)  nu[b+1] = nu[b--];
		    nu[b+1] = key;
		}

        return nu[0]*10+nu[1]*10+nu[2]+nu[3];
    }
}
