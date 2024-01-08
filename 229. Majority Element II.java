// Moore voting
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=0;
        int num2=0;
        int c1=0;
        int c2=0;
        List<Integer> l =new ArrayList<>();

        for (int num: nums){
            if (num1 == num) c1++;
            else if (num2 == num) c2++;
            else if (c1==0){
                num1=num;
                c1=1;
            }
            else if (c2==0){
                num2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }

        if (num1==num2){
            c1=0;
            for (int num: nums){
                if (num==num1) c1++;
                if (c1>nums.length/3){
                    l.add(num1);
                    break;
                }
            }
            return l;
        }
        else{
            c1=c2=0;
            for (int num : nums) {
                if (num == num1)
                    c1++;   // Count occurrences of 'num1'
                else if (num == num2)
                    c2++;   // Count occurrences of 'num2'
            }
            if (c1>nums.length/3) l.add(num1);
            if (c2>nums.length/3) l.add(num2);
            return l;
        }
    }
}
