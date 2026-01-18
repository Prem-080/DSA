import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
       int len = digits.length;
       for(int i = len - 1; i >= 0; i--){
        // Every case:
        if(digits[i] != 9){
            digits[i]++;
            return digits;
        }
        // 119 case
        digits[i] = 0;
       }
       // 999 case.
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

}
