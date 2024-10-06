class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        
        // If lengths are different, return false
        if (pattern.length() != words.length) {
            return false;
        }

        // Create two maps for bidirectional mapping
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        // Loop over the pattern and words simultaneously
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if the character in the pattern is already mapped to a word
            if (charToWord.containsKey(c)) {
                // If the word doesn't match the mapped word, return false
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                // If the word is already mapped to another character, return false
                if (wordToChar.containsKey(word)) {
                    return false;
                }

                // Establish the new mapping
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        // If we made it through the loop, the pattern matches
        return true;
    }
}
