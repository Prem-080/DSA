class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i: piles){
            if(i > max) max = i;
        }

        int l = 1, r = max;
        while(l < r){
            int mid = l + (r - l)/2;
            int hours = 0;
            for(int pile: piles){
                hours += (pile + mid - 1)/ (mid);
            }
            if(hours <= h) r = mid;
            else l = mid + 1;
        }
        return r;
    }
}
