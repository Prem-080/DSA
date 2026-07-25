class Solution {
    public int maxProduct(int n) {
        int prod = 1, len = (int) Math.log(n) + 1;
        int[] digits = new int[len];
        int i = 0;
        while(n != 0){
            digits[i++] = n % 10;
            n /= 10;
        }
        Arrays.sort(digits);
        return digits[len - 1] * digits[len - 2];

    }
}
