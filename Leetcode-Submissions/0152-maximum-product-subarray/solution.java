class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int prod = 1;
        for(int j = 0; j < nums.length; j++){
            prod *= nums[j];
            if(prod > max){
                max = prod;
            }
            if(prod == 0){
                prod = 1;
            }

        }
        prod = 1;
        for(int j = nums.length - 1; j >= 0; j--){
            prod *= nums[j];
            if(prod > max){
                max = prod;
            }
            if(prod == 0){
                prod = 1;
            }
        }
        return max;
    }
}
