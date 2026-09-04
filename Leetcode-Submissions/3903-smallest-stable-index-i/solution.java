class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < min[i + 1]){
                min[i] = nums[i];
                continue;
            }
            min[i] = min[i + 1];
        }

        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]) max = nums[i];
            if(max - min[i] <= k) return i;
        }
        return -1;
    }
}
