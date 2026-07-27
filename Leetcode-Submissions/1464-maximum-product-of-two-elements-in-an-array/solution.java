class Solution {
    public int maxProduct(int[] nums) {
        int i=0,j=0 , max1 = 0, max2 = 0, n = nums.length;
        while(i < n){
            if(max1 < nums[i] ){
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2 < nums[i]){
                max2 = nums[i];
            }
            i++;
        }
        max1--;
        max2--;
        return max1 * max2;
    }
}
