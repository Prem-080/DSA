class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int count = 0, max = 0;
        while(j < nums.length){
            max = Math.max(max, count);
            if(nums[j] == 0){
                if(k > 0){
                    k--;
                    count++;
                }
                else{
                    while(nums[i] != 0){
                        i++;
                        count--;
                    }
                    i++;
                }
            }
            else{
                count++;
            }
            j++;
        }
        max = Math.max(count, max);
        return max;
    }
}
