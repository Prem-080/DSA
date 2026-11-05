class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int val = 0;
        for(int x: arr1){
            val++;
            for(int y: arr2){
                if(Math.abs(x-y) <= d){
                    val--;
                    break;
                }
            }
        }
        return val;
    }
}
