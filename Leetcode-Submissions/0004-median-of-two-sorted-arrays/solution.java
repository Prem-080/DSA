class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] res = merge(nums1, nums2);
       int x = res.length;
       if(x % 2 == 1){
        return res[x/2];
       }
       else{
        return (res[x/2] + res[x/2 - 1])/2.0;
       }
    }

    public int[] merge(int[] arr1, int[] arr2){
        int l = 0, r = 0, m = arr1.length, n = arr2.length;
        int[] res = new int[m + n];
        int i = 0;
        while(l < m && r < n){
            if(arr1[l] < arr2[r]){
                res[i++] = arr1[l++];
            }
            else{
                res[i++] = arr2[r++];
            }

        }
        while(l < m){
            res[i++] = arr1[l++];
        }
        while(r < n){
            res[i++] = arr2[r++];
        }
        return res;
    }
}
