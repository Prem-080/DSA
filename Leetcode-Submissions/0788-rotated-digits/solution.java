class Solution {
    public int rotatedDigits(int n) {
        int[] dp = new int[n + 1];
        int count = 0;
        // 2 = (0, 1, 8) = rotated to same number
        // 1 =  (2, 5, 6, 9) = rotated to differnt number
        // 0 = (3, 4, 7) = invalid after rotation.
        for(int i = 0; i <= n; i++){
            if(i < 10){
                if(i == 2 || i == 5 || i == 6 || i == 9){
                    dp[i] = 1;
                    count++;
                }
                else if(i == 0 || i == 1 || i == 8){
                    dp[i] = 2;
                }
                else{
                    dp[i] = 0;
                }
            }
            else{
                // check if atleast one digit is valid number and all the other digits are atleast a number.
                int a = dp[i % 10]; // last digit
                int b = dp[i / 10]; // prior
                if(a == 2 && b == 2) dp[i] = 2; // valid but not different
                else if(a >=1 && b >= 1){
                    dp[i] = 1;
                    count++;
                }
                else dp[i] = 0;
            }
        }
        return count;
    }
}
