class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i || nums[i] == nums.length){
                i++;
            }
            else{
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
        }
        i = 0;
        while(i < nums.length){
            if(i != nums[i]){
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
