class Solution {
    public boolean canTransform(int[] s, int[] t) {
        long s1 = 0, s2 = 0;
        for(int i = 0; i < s.length; i++){
            s1 += s[i];
            s2 += t[i];
        }
        if(s1 == s2) return true;
        return false;
    }
}
