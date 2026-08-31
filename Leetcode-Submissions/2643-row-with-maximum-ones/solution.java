class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = -1, indx = -1;
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1) count++;
            }
            if(max < count){
                max = count;
                indx = i;
            }
            
        }
        return new int[] {indx, max};
    }
}
