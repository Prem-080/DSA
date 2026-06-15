class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int j = 0;
            while(j < nums[i]){
                count += freq.getOrDefault(j, 0);
                j++;
            }
            nums[i] = count;
        }

        return nums;   
    }
}
