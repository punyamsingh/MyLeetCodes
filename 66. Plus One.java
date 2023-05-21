/* python soln beats 5%
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        def addone(digits: List[int]):
            a=len(digits)-1
            if a+1 == 0:
                return [1]
            if (digits[a]==9):
                digits[a]=0
                digits[:a]=addone(digits[:a])
            else:
                digits[-1]+=1
            return digits
        return addone(digits)
 */
 //Java soln beats 100%
 class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
