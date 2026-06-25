class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int l = 0, r = 0;
        int count = 0;
        long sum = 0;
        while(l < nums.length){
            r = l;
            sum = 0;
            while(r < nums.length){
                sum += nums[r++];
                if(checkValid(sum, x)){
                    count++;
                }
            }
            l++;
        }
        return count;

    }
    boolean checkValid(long sum, int x) {
        long first = sum;
        while (first >= 10) {
            first /= 10;
        }

        long last = sum % 10;

        return first == last && first == x;
    }
    
}
