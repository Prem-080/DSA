class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0, n = nums.length;
        while(i < n){
            if(nums[i] == i + 1){
                i++;
            }
            else {
                if(nums[nums[i] - 1] == nums[i]){
                    return nums[i];
                }
                else{
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i]  = temp;
                 }
            
            }
        }
        return nums[0];
    }
}
