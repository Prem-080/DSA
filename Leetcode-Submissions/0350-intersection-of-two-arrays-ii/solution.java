class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums1){
            mp1.put(num, mp1.getOrDefault(num, 0) + 1);
            set.add(num);
        }
        for(int num: nums2){
            mp2.put(num, mp2.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i: set){
            if(mp1.containsKey(i) && mp2.containsKey(i)){
                int min = Math.min(mp1.get(i) , mp2.get(i));
                while(min != 0){
                    res.add(i);
                    min--;
                }
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for(int num: res){
            ans[i++] = num;
        }

        return ans;
    }
}
