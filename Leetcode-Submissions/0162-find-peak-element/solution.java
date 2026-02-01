class Solution {
    public int findPeakElement(int[] arr) {
        int st = 0, en = arr.length - 1;
        while(st < en){
            int mid = st + (en - st) / 2;
            if(arr[mid] > arr[mid + 1]){
                en = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                st = mid + 1;
            }
        }
        return st;
    }
}
