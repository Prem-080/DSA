class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
        ans[1] = search(nums, target, false);
        }
        return ans;
        
    }

    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int st = 0, en = nums.length - 1;
        while(st <= en && en >= 0){
            int mid = st + (en - st)/2;
            if(nums[mid] < target){
                st = mid + 1;
            }
            else if(nums[mid] > target){
                en = mid - 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    en = mid -1;
                }
                else{
                    st = mid + 1;
                }
            }
            

        }
        return ans;
    }


}
