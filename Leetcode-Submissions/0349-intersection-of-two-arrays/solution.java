class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums1){
            n1.add(num);
        }
        for(int num: nums2){
            if(n1.contains(num)){
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int num: set){
            res[i++] = num;
        }

        return res;

    }
}
