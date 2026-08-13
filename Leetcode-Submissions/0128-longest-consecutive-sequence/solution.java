class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int best = 0;
        for(int n: set){
            if(!set.contains(n - 1)){
                int len = 1;
                while(set.contains(n + len)){
                    len++;
                }
                best = Math.max(best, len);
            }
        }
        return best;
    }
}
