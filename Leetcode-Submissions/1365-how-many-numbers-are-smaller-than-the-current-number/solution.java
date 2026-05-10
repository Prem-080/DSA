class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>();
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++){
            index.put(temp[i], index.getOrDefault(temp[i], i));
        }

        for(int i = 0; i < nums.length; i++){
           nums[i] = index.get(nums[i]);
        }

        return nums;   
    }
}
