class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c: letters){
            letterCount.put(c, 1+letterCount.getOrDefault(c,0));
        }
        return backtrack(words, score, 0, letterCount);
    }

    private int backtrack(String[] words, int[] score, int i, Map<Character, Integer> lhm){
        if (i==words.length) return 0;
        String word = words[i];
        int res1=backtrack(words, score, i+1, lhm);
        int res2=0;
        
        if (canBuild(word, lhm)){
            Map<Character, Integer> lhm_updated = new HashMap<>(lhm);
            updateLHM(word, lhm_updated);
            int marks = getScore(word, score);
            res2 = marks + backtrack(words, score, i+1, lhm_updated);
        }

        return Math.max(res1, res2);
    }

    private boolean canBuild(String w, Map<Character, Integer> lhm){
        Map<Character, Integer> w_lhm = new HashMap<>();
        for (char c: w.toCharArray()){
            w_lhm.put(c, 1+w_lhm.getOrDefault(c,0));
        }
        for (Character key : w_lhm.keySet()) {
            if (!lhm.containsKey(key) || w_lhm.get(key) > lhm.get(key)) return false;
        }
        return true;
    }

    private void updateLHM(String w, Map<Character, Integer> lhm){
        for (char c: w.toCharArray()){
            lhm.put(c, lhm.get(c)-1);
        }
    }

    private int getScore(String s, int[] score){
        int res=0;
        for (char ch : s.toCharArray()) {
            res += score[ch-'a'];
        }
        return res;
    }
}
