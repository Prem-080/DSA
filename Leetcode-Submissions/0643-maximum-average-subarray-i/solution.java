class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, n = nums.length, j = 0;
        int sum = 0, max = Integer.MIN_VALUE;
        while(j < n){
            sum += nums[j];

            if(j - i == k){
                sum -= nums[i];
                i++;
            }
            if(j - i >= k - 1){
                max = Math.max(max, sum);
            }
            j++;
        }
        return (double) max / k;
    }
}
