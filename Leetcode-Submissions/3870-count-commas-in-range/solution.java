class Solution {
    public int countCommas(int n) {
        int count = 0;
        int temp = 1000;
        while (temp <= n) {
            count += (n - temp + 1);
            temp *= 1000;
        }
        return count;
    }
}
