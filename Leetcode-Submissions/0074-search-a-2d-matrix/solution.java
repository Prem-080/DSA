class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lRow = 0, rRow = m - 1;
        while(lRow < rRow){
            int mid = lRow + (rRow - lRow) / 2;
            if(target <= matrix[mid][n - 1]){
                rRow = mid;
            }
            else if(target > matrix[mid][n - 1]){
                lRow = mid + 1;
            }
            else{
                return true;
            }
        }
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(matrix[lRow][mid] == target){
                return true;
            }
            else if(matrix[lRow][mid] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;

    }
}
