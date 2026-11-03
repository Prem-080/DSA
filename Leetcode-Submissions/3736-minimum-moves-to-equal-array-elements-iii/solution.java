class Solution {
    public int minMoves(int[] nums) {
        int max = -1;
        for(int x: nums){
            max = max > x ? max : x;
        }
        int moves = 0;
        for(int x: nums){
            moves += max - x;
        }
        return moves;
    }
}
