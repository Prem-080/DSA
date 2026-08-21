class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int diff = n - k;
        int j = 0;
        int[] ans = new int[n];
        for(int i = diff; i < n; i++, j++){
            ans[j] = nums[i];
        }
        j = j;
        for(int i = 0; i < diff; i++,j++){
            ans[j] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
    }
}
