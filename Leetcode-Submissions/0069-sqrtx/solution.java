class Solution {
    public int mySqrt(int x) {
        int l = 1, r = x;
        int sqrt = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(mid * mid == x){
                sqrt = mid;
                break;
            }
            else if(mid <= x / mid) {
                sqrt = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return sqrt;
    }
}
