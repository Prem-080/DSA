class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
            else i++;
        }
       List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // If the number at this index doesn't belong here, it's a duplicate
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
