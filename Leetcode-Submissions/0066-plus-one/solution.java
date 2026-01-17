import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(len = len - 1; len >= 0; len-- ){
            if(digits[len] != 9){
                digits[len]++;
                return digits;
            }
            digits[len] = 0; 
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

        
    }

}
