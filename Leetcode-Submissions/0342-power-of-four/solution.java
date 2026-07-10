class Solution {
    public boolean isPowerOfFour(int n) {
        // every number divided by 4 is also divided by 2.
        // So, we check if the number is a multiple of 2.
        // Then we check if it leaves a remainder of 1 when divided by 3, since all numbers divided by 4 leaves 1 as a remainder when divided by 3.
        // return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
        return (n > 0) && ((n & (n - 1)) == 0) && (n & 0xAAAAAAAA) == 0;
    }
}
