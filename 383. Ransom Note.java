class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] m = new int[26];
        for (int i=0; i<magazine.length(); i++){
            m[magazine.charAt(i)-'a']++;
        }
        int[] r = new int[26];
        for (int i=0; i<ransomNote.length(); i++){
            r[ransomNote.charAt(i)-'a']++;
        }

        for (int j=0; j<26; j++){
            if (m[j]<r[j]) return false;
        }
        return true;
    }
}
