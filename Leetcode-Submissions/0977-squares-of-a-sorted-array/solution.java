class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
        }

        int[] negNums = new int[i];
        int n = i;
        for(int j = 0; j < i; j++){
            negNums[j] = nums[n - 1] * nums[n - 1];
            n--; 
        }

        int[] posNums = new int[nums.length - i];
        for(int j = i, k = 0; j < nums.length && k < nums.length - i; j++, k++){
            posNums[k] = nums[j] * nums[j];
        }
        nums = merge(negNums, posNums);
        return nums;
    }

     public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for merged array

        // Traverse both arrays and copy the smaller element
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
