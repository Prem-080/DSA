class Solution {
    public long gcdSum(int[] nums) {
        int mx = 0;
        int[] prefixGCD = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(mx < nums[i]) mx = nums[i];
            prefixGCD[i] = gcd(nums[i], mx);
        }
        Arrays.sort(prefixGCD);
        int l = 0, r = nums.length - 1;
        long sum = 0;
        while(l < r){
           sum += gcd(prefixGCD[l++], prefixGCD[r--]);
        }
        return sum;
    }

    int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
