class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;  // If s1 is longer than s2, impossible to have permutation

        int[] count_s1 = new int[26];  // Count array for s1
        int[] count_s2 = new int[26];  // Sliding window count for s2

        // Count the frequency of characters in s1 and the first window in s2
        for (int i = 0; i < n1; i++) {
            count_s1[s1.charAt(i) - 'a']++;
            count_s2[s2.charAt(i) - 'a']++;
        }

        // Count how many characters are already matching
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (count_s1[i] == count_s2[i]) matches++;
        }

        // Slide the window over the rest of s2
        for (int i = n1; i < n2; i++) {
            if (matches == 26) return true;  // If all characters match, return true

            // Add new character (expand the window)
            int newCharIndex = s2.charAt(i) - 'a';
            count_s2[newCharIndex]++;
            if (count_s1[newCharIndex] == count_s2[newCharIndex]) {
                matches++;  // If the count now matches, increment the match count
            } else if (count_s1[newCharIndex] + 1 == count_s2[newCharIndex]) {
                matches--;  // If we just exceeded the correct count, decrement the match count
            }

            // Remove old character (shrink the window)
            int oldCharIndex = s2.charAt(i - n1) - 'a';
            count_s2[oldCharIndex]--;
            if (count_s1[oldCharIndex] == count_s2[oldCharIndex]) {
                matches++;  // If the count now matches, increment the match count
            } else if (count_s1[oldCharIndex] - 1 == count_s2[oldCharIndex]) {
                matches--;  // If we just went below the correct count, decrement the match count
            }
        }

        return matches == 26;  // Final check for the last window
    }
}
