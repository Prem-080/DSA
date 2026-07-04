class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxLeft = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;

        for (int i = k; i < nums.length; i++) {
            maxLeft = Math.max(maxLeft, nums[i - k]);
            ans = Math.max(ans, maxLeft + nums[i]);
        }

        return ans;
    }
}
