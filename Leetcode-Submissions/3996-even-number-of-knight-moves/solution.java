class Solution {
    public boolean canReach(int[] start, int[] target) {
        int s = (start[0] + target[0]) % 2, t = (start[1] + target[1]) % 2;
        if(s == t) return true;
        return false;
    }
}
