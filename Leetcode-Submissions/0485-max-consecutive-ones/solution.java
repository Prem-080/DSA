class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0;
        int max = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                i = j + 1;
            }
            if(max < (j - i + 1)){
                max = j - i + 1;
            }
            j++;
        }
        return max;
    }
}
