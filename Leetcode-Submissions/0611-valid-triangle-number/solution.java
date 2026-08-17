class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int k = nums.length - 1; k > 1; k--){
            int j = k - 1, i = 0; 
            while(i < j){
                if(nums[i] + nums[j] > nums[k]){
                    count += (j - i);
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return count;

    }
}
