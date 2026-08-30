class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, max = 0, k = 1;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                if (k > 0) {
                    k--;
                } else {
                    while (nums[i] != 0) {
                        i++;
                    }
                    i++;
                }
            }

            max = Math.max(max, j - i + 1);
        }

        return max - 1;
    }
}
