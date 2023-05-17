class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if (s == null || s.length() == 0) {
        //     return 0;
        // }
        // int n = s.length(), max=0, start=0;
        // List<String> myList = new ArrayList<>();
        // for (int i=0; i<n; i++){
        //     String cur = Character.toString(s.charAt(i));
        //     if (myList.contains(cur)) {
        //         myList.subList(0, myList.indexOf(cur)+1).clear();
        //     }
        //     myList.add(cur);
        //     max=Math.max(myList.size(), max);
        // }
        // return max;
        
        int n = s.length(), max = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int index = map.get(c);
                if (index >= start) {
                    start = index + 1;
                }
            }
            map.put(c, i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
