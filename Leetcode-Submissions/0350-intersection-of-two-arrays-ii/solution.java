class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;;
        int n = nums1.length < nums2.length ? nums1.length : nums2.length;
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length){
                if(nums1[i] == nums2[j]){
                    res.add(nums1[i]);
                    i++;
                    j++;
                }
                else if(nums1[i] < nums2[j]){
                    i++;
                }
                else{
                    j++;
                }
        }
        int[] resArray = new int[res.size()];

        for(i = 0; i < res.size(); i++){
            resArray[i] = res.get(i);
        }

        return resArray;
    }

}
