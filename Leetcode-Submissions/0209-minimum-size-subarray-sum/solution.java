class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                sum -= nums[j];
                if(min > i - j + 1){
                    min = i - j + 1;
                }
                j++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
