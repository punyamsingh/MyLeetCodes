class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // If needle is empty, return 0 (by problem definition)
        }
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            int j = 0;
            while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLen) {
                return i; // Found the needle, return starting index
            }
        }

        return -1; // Needle not found in haystack
    }
}
