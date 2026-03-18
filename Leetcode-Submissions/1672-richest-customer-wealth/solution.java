class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1, rows = accounts.length, cols = accounts[0].length;
        for(int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0; j < cols; j++){
                sum += accounts[i][j];
            }
            if(max < sum) max = sum;
        }

        return max;
    }
}
