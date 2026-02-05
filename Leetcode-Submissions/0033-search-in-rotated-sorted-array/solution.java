class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, ans = -1;
        int st = 0, en = n - 1;
        while(st <= en){
            int mid = st + (en - st) / 2;
            if(mid < en && nums[mid] > nums[mid + 1]) {
                st = mid + 1;
                ans = mid;
            }
            else if(mid > st && nums[mid] < nums[mid - 1]){
                en = mid - 1;
                ans = mid - 1;
            } 
            else if(nums[st] >= nums[mid]) en = mid - 1;
            else if(nums[st] <= nums[mid]) st = mid + 1;

        }

        if(target > nums[n - 1]){
            return binarySearch(nums, 0, ans, target);
        }
        return binarySearch(nums, ans + 1, n - 1, target);
    }

    static int binarySearch(int[] arr, int st, int en, int target){
        while(st <= en){
            int mid = st + (en - st) / 2;
            if(arr[mid] < target){
                st = mid + 1;
            }
            else if(arr[mid] > target){
                en = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

