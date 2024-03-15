class Solution {
    public static boolean isVowel(char letter) {
        String vowels = "aeouiAEOUI";
        return vowels.indexOf(letter) != -1; 
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<ch.length; i++){
            if (isVowel(ch[i])) l.add(i);            
        }
        for (int j=0; j<(l.size()/2); j++){
            char temp = ch[l.get(j)];
            ch[l.get(j)]=ch[l.get(l.size()-1-j)];
            ch[l.get(l.size()-1-j)]=temp;
        }
        return new String(ch);
    }
}
