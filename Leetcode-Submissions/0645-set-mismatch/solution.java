class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actual_sum = sum(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int unique_sum = sum(set);

        int expected_sum = (n * (n + 1)) / 2;
        int duplicate = actual_sum -unique_sum;
        int missing = expected_sum - unique_sum;
        return new int[] {duplicate, missing};
    }
    int sum(int[] nums){
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return sum;
    }
    int sum(Set<Integer> nums){
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        return sum;

    }
}

