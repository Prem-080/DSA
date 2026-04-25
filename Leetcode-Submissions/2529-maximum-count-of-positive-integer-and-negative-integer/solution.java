class Solution {
    public int maximumCount(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] < 0){
                i = mid + 1;
            }
            else if(nums[mid] >= 0){
                j = mid -1;
            }
        }
        // after the loop ends. j = ending index of negative numbers, i = starting index of non-negative numbers.
        int neg = j + 1;
        int pos = 0;
        j = nums.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] == 0){
                i = mid + 1;
            }
            else if(nums[mid] > 0){
                j = mid -1;
            }
        }

        pos = nums.length - i ;
        return pos > neg ? pos : neg;

    }
}
