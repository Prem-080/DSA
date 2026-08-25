class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            set.add(num);
            if(max < num){
                max = num;
            }
        }
        for(int i = 1; i <= max + k; i++){
            if(i % k == 0 && !set.contains(i)){
                return i;
            }
        }
        return -1;
        
    }
}
