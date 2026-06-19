class Solution {
    public boolean checkGoodInteger(int n) {
        int d = 0, s = 0;
        while(n != 0){
            d = d + (n % 10);
            s = s + ((n % 10) * (n % 10));
            n /= 10;
        }
        return (s - d) >= 50 ? true : false;
    }
}
