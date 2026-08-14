class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            char ch = s.charAt(i);
            freq[ch - 'a'] = 1;
            int len = 1, j = i + 1;
            while(j < s.length()){
                char ch2 = s.charAt(j);
                if(freq[ch2 - 'a'] < 2){
                    freq[ch2 - 'a']++;
                    len++;
                    j++;
                }
                else{
                    break;
                }
            }
            max = Math.max(max, len);
        }

        return max;


    }
}
