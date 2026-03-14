class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        int i = n - 1;
        while(i >= 0){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
            i--;
        }
        return arr;
    }
}
