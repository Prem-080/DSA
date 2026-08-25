class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(i < j){
            int min = Math.min(height[i], height[j]);
            int fill = min * (j - i);
            if(fill > max){
                max = fill;
            }
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
