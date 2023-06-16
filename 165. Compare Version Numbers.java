class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int len1 = version1.length(), len2 = version2.length();
        int num1 = 0, num2 = 0;
        
        while (i < len1 || j < len2) {
            while (i < len1 && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            
            while (j < len2 && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if (num1 > num2) {
                return 1;
            } else if (num2 > num1) {
                return -1;
            }
            
            num1 = 0;
            num2 = 0;
            i++;
            j++;
        }
        
        return 0;  // Versions are equal
    }
}
