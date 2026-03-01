class Solution {
    public int splitArray(int[] nums, int k) {
        int st = 0, en = 0, n = nums.length - 1;
        int sum = 0, max = -1;
        for(int i = 0; i <= n; i++){
            if(nums[i] > st) {
                st = nums[i];
            }
            en += nums[i];
        }

        while(st < en){
            // try for mid as potential answer
            int mid = st + (en - st) / 2;

            //calculate how many pieces you can divide with this mid.
            sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces <= k){
                en = mid;
            }
            else{
                st = mid + 1;
            }
        }


        return en; // here start == end
    }
}
