class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i <= nums.length - k; i++){
           int r = (i + k), l = i;
           HashSet<Integer> seen = new HashSet<>();
           while(l < r){
            if(seen.contains(nums[l])){
                l++;
                continue;
            }
            mp.put(nums[l], mp.getOrDefault(nums[l], 0) + 1);
            seen.add(nums[l]);
            l++;
           }
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            int key = entry.getKey(), value = entry.getValue();
            if(value == 1){
                max = max < key ? key : max;
            }
        }
        return max;
    }
}
