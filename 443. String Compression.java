class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) return 0;

        char cur = chars[0];
        int ans = 0;
        int count = 1;
        int index = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == cur) {
                count++;
            } else {
                chars[index++] = cur;
                ans++;
                if (count > 1) {
                    char[] countChars = String.valueOf(count).toCharArray();
                    for (char c : countChars) {
                        chars[index++] = c;
                        ans++;
                    }
                }
                cur = chars[i];
                count = 1;
            }
        }

        chars[index++] = cur;
        ans++;
        if (count > 1) {
            char[] countChars = String.valueOf(count).toCharArray();
            for (char c : countChars) {
                chars[index++] = c;
                ans++;
            }
        }

        return ans;
    }
}
