class Solution {
    public int largestAltitude(int[] gain) {
        int mx = 0, alt = 0;
        for(int x: gain){
            alt += x;
            mx = (alt > mx) ? alt : mx;
        }
        return mx;

    }
}
