class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(mid * mid == num) return true;
            if(mid > num / mid) r = mid - 1;
            else l = mid + 1;
        }
        return false;

    }
}
