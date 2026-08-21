class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, j = 0;
        int[] seen = new int[128];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(seen[ch] > j){
                j = seen[ch];
            }
            int len = i - j + 1;
            if(len > max) max = len;

            seen[ch] = i + 1;

        }
        return max;
    }
}
