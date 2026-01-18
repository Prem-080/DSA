class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        int k = 0;
        if(i == j){
            return  nums[i] == val ? k : k + 1;
        }
        while(i <= j){
            if(nums[i] == val){
                swap(nums, i, j);
                j--;
                continue;
            }
            i++;
            k++;
        }

        return k;
    }
    void swap(int[] nums, int i, int j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
