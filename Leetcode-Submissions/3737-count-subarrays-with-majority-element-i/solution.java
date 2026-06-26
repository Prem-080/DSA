class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int[] pref = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            // element == target are replaced to +1 and others to -1
            // also calculate prefix sum.
            if(nums[i] == target){
                pref[i + 1] = pref[i] + 1;

            }
            else{
                pref[i + 1] = pref[i] - 1;
            }
        }
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                // this is the sum  from [0..j] . pref[j]
                // and to find the sum of the sub array [i..j],
                // pref[j] - pref[i - 1]
                if(pref[j + 1] - pref[i] > 0){
                    count++;
                }
            }
        }
        return count;
    }
}
