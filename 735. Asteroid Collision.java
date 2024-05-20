class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int i=0;
        while (i<asteroids.length){
            if (s.isEmpty()){
                s.push(asteroids[i++]);
                continue;
            }
            int a = s.peek();
            int b = asteroids[i];
            
            if (a > 0 && b < 0){
                int c = Math.abs(a);
                int d = Math.abs(b);
                if ( c >= d) i++;
                if (c <= d) s.pop();
            }
            else{
                s.push(b);
                i++;
            }
        }
        int[] result = new int[s.size()];
        for (int j = 0; j < s.size(); j++) {
            result[j] = s.get(j);
        }
		return result;
    }
}
