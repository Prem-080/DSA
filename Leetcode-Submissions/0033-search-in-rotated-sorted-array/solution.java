class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n - 1;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){ // the target lies ahead the mid or before the mid
                if(nums[mid] < nums[n - 1] && target > nums[n - 1]){ // if mid is in the left part 
                    // then move i
                    j = mid - 1;
                }
                else{
                    i = mid + 1;
                }
            }
            else{// the target either lies before mid or after mid
                if(nums[mid] > nums[n - 1] && target <= nums[n - 1]){
                    i = mid + 1;
                }
                else{
                    j = mid - 1;
                }
                
            }

        }
        return -1;
        
    }
}
