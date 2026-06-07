class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i + 1|| nums[i] <= 0 || nums[i] > nums.length){
                i++;
            }
            else{
                if(nums[nums[i] - 1] == nums[i] ){
                    i++;
                    continue;
                }
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        i = 0;
        while(i < nums.length){
            if(i + 1 != nums[i]){
                return i + 1;
            }
            i++;
        }
        return nums.length + 1;
    }

}
