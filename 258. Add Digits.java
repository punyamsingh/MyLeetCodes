class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public int addDigits(int num) {
        while (num>9){
            num=turnnum(num);
        }
        return num;
    }

    int turnnum(int num){
        if (map.containsKey(num)){
            return map.get(num);
        }
        int sum=0;
        while (num!=0){
            sum+=(num%10);
            num=num/10;
        }
        map.put(num,sum);
        return sum;
    }
}
