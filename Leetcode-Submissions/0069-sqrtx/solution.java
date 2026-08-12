class Solution {
    public int mySqrt(int x) {
        int a = 1, b = x, mid = a + (x - a) / 2;
        int sqrt = 0;
        while(a <= b){
            if(mid == x / mid){
                return mid;
            }
            else if(mid < x / mid){
                sqrt = mid;
                a = mid + 1;
            }
            else{
                b = mid - 1;
            }
            mid = a + (b - a) / 2;

        }
        return sqrt;

    }
}
