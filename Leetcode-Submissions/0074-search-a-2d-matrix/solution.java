class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        if(cols == 0){
            return false;
        }
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int cMid = cols/2;
        int rStart = 0, rEnd = rows - 1;
        while(rStart < rEnd - 1){
            int rMid = rStart + (rEnd - rStart) / 2;
            if(matrix[rMid][cMid] == target) return true;
            else if(matrix[rMid][cMid] > target) rEnd = rMid;
            else rStart = rMid;
        }
        // now we only have 2 rows.

        //check in the middle column of those 2 rows.
        if(matrix[rStart][cMid] == target) return true;
        else if(matrix[rStart + 1][cMid] == target) return true;

        // search in 1st half 
        if (cMid != 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target); 
        }
         // search in 2nd half 
        if (cMid != cols - 1 && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half 
        if (cMid != 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target); 
        } 
        else { 
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
        
        
    }
    boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }
}
