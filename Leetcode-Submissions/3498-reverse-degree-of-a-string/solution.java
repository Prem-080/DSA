class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            degree += (26 - ch) * (i + 1);
        }
        return degree;
    }
}
