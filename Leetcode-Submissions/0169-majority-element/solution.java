class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int mid = n/2;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        Set<Integer> keys = mp.keySet();
        List<Integer> myList = new ArrayList<>(keys);
        int i =0;
        for(int value:  mp.values()){
            if(value > mid) return myList.get(i);
            i++;
        }
        return -1;
    }
}
