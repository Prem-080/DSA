class Solution {
    public int findGCD(int[] nums) {
        int min = 1001, max = 0;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
        }
        return gcd(min, max);
    }
    int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
