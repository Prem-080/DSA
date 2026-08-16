class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // closest = -1;
        // [-1, 3,2,-4,5,6,7,-3,-9] target = 3
        // i = -1 , j = 3 , k = 1
        // |target - sum|  = 1 minimum closeset return sum;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
           
            int j = i + 1, k = nums.length - 1;
            while (j < k) { // 2 pointers
                int sum = nums[i] + nums[j] + nums[k];
               
                if(Math.abs(sum - target) < Math.abs(closest - target)){
                    closest = sum;
                }
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                }
                else{
                    return closest;
                }
            }
        }
        return closest;

    }
}

