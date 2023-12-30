class Solution {
    public boolean makeEqual(String[] words) {
        int[] chars = new int[26];
        for (String word: words){
            for (char i: word.toCharArray()){
                chars[((int) i)%26]+=1;
            }
        }
        for (int i: chars) if (i%words.length!=0) return false;
        return true;
    }
}
