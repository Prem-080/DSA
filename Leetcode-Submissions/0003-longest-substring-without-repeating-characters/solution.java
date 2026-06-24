class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int left = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i);
            if(last[ch] > left){
                left = last[ch];
            }
            int len = i - left + 1;
            if(len > max){
                max = len;
            }
            last[ch] = i + 1;
        }

        return max;


    }
}
