class Solution {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    
    public String numberToWords(int num) {

        //TAKE number divide by 1000 and store remainder.
        // send remainder to 3 digit function.
        // add "" to result. increment in array. result+=original
        // keep until number is 0.
        if (num == 0) return "Zero";
        
        String result = "";
        int i = 0;
        
        while (num > 0) {
            if (num % 1000 != 0) {
                result = threeDigit(num % 1000) + THOUSANDS[i] + " " + result;
            }
            num /= 1000;
            i++;
        }
        
        return result.trim();
    }

    public String threeDigit(int num) {
        if (num == 0) return "";
        if (num < 20) return LESS_THAN_20[num] + " ";
        else if (num < 100) return TENS[num / 10] + " " + threeDigit(num % 10);
        else return LESS_THAN_20[num / 100] + " Hundred " + threeDigit(num % 100);
    }
}
