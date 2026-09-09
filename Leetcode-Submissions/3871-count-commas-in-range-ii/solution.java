class Solution {
    public long countCommas(long n) {
        long count = 0;
        long temp = 1000;
        while (temp <= n) {
            count += (n - temp + 1);
            temp *= 1000;
        }
        return count;
    }
}
