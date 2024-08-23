class Solution {
    public String fractionAddition(String expression) {
        int A=0;
        int B=1;

        String[] fracs=expression.replace("+"," +").replace("-", " -").split(" ");
        for (String s: fracs){
            if (s.isEmpty()) continue;
            String[] nums= s.split("/");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            A = A*b+B*a;
            B*=b;

            int d = gcd(Math.abs(A), B);
            A/=d;
            B/=d;
        }

        // Ensure the denominator is positive
        if (B < 0) {
            A = -A;
            B = -B;
        }
        return A + "/" + B;
    }

    public int gcd(int x, int y){
        while (y>0){
            int m=x%y;
            x=y;
            y=m;
        }
        return x;
    }
}
