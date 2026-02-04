class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // [4,1,2] [1,3,4,2]
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] arr = new int[nums1.length];
        int i = 0;
        for(int key: nums2){
            mp.put(key, i++);
        }

        for(i = 0; i < nums1.length; i++){
            int start = mp.get(nums1[i]);
            arr[i] = search(nums2, start, nums1[i]);
        }

        return arr;
        
    }

    int search(int[] arr, int st,int key){
        for(int i = st + 1; i < arr.length; i++){
            if(arr[i] > key){
                return arr[i];
            }
        }
        return -1;
    }

    
}
