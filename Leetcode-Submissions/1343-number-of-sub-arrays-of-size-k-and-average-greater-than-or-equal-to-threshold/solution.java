class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int i = 0, n = nums.length, j = 0;
        int sum = 0;
        int count = 0;
        while(j < n){
            sum += nums[j];
            if(j - i == k - 1){
                if(sum / k >= threshold) count++;
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return count;
        
    }
}
