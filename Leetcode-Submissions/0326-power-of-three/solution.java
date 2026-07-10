class Solution {
    public boolean isPowerOfThree(int n) {
        //System.out.println(Math.pow(3,19));
        return n > 0 && (int)1.162261467E9 % n == 0;
    }
}
