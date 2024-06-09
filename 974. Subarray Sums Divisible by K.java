class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,sum=0,rem;
        int md[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            rem=sum%k;
            if(rem<0)
            rem+=k;
            md[rem]++;
        }
        for(int i=0;i<k;i++)
        {
            if(md[i]>1)
            count+=(md[i]*(md[i]-1))/2;
        }
        count+=md[0];
        return count;
    }
}

// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0,1);
//         int prefix=0;
//         int result=0;
//         for (int i=0; i<nums.length; i++){
//             prefix+=nums[i];
//             int rem=prefix%k;
//             if (rem < 0) rem += k;
//             if (map.containsKey(rem)){
//                 result+=map.get(rem);
//                 map.put(rem, map.get(rem)+1);
//             }
//             else{
//                 map.put(rem,1);
//             }
//         }
//         return result;
//     }
// }
