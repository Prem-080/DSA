class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int i = 1;
        arr[0] = 1;
        while(i < arr.length){
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
            i++;
        }
        return arr[arr.length - 1];


    }
}
