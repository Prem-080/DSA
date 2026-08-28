class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0;
        long max = 0;
        HashSet<Integer> subset = new HashSet<>();
        for(; j < nums.length; j++){
            int num = nums[j];
            while(subset.contains(num)){
                subset.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            subset.add(num);
            sum += (long) num;
            if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum -= nums[i];
                subset.remove(nums[i]);
                i++;
            }


        }
        return max;
    }
}
