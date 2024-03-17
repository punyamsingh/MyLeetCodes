class Solution {
    public boolean isVowel(char c){
        if (c=='a') return true;
        if (c=='e') return true;
        if (c=='i') return true;
        if (c=='o') return true;
        if (c=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        char[] ch = s.toCharArray();

        int curcount=0;
        for (int i=0; i<k; i++){
            if (isVowel(ch[i]))
                curcount++;
        }
        int maxcount=curcount;
        for (int i=k; i<ch.length; i++){
            if (isVowel(ch[i])) curcount++;
            if (isVowel(ch[i-k])) curcount--;
            
            maxcount=Math.max(maxcount, curcount);
        }
        return maxcount;
    }
}
