class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0, rightSum = sum(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0) leftSum += nums[i - 1];
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
    static int sum(int[] nums){
        int sum = 0;
        for(int j: nums){
            sum += j;
        }
        return sum;
    }

}
