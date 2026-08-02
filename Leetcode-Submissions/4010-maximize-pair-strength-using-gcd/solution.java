class Solution {
    public long maxPairStrength(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        long max = -1;
        while(i < n){
            j = i + 1;
        while(j < n){
            long gcd = gcd(nums[i], nums[j]);
            long mul = (1L * nums[i] * nums[j]);
            gcd *= gcd;
            long temp = mul / gcd;
            if(max < temp){
                max = temp;
            }
            j++;
        }
            i++;
        }
        return max;
        
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
