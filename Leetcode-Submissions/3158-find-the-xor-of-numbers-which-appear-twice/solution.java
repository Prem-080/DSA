class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] arr = new int[51];
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] ^ arr[nums[i]]) != 0){
                arr[nums[i]] = nums[i];
                continue;
            }
            xor ^= nums[i];
        }
        return xor;
    }
}
