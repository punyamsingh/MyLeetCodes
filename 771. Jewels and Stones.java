class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> h = new HashSet<Character>();
        for (int i=0; i<jewels.length(); i++){
            h.add(jewels.charAt(i));
        }
        int k=0;
        for (int i=0; i<stones.length(); i++){
            if (h.contains(stones.charAt(i))){
                k++;
            }
        }

        return k;
    }
}
