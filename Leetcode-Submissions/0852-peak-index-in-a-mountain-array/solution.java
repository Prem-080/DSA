class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int st = 0, en = arr.length - 1;
        while(st <= en){
            int mid = st + (en - st) / 2;            
            if(arr[mid] > arr[mid + 1]){
                en = mid - 1;
            }
            else if(arr[mid] < arr[mid + 1]){
                st = mid + 1;
            }
        }
        return st;
    }
}
