class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, res = 0;
        char[] carr = s.toCharArray();
        int[] arr = new int[26];
        int maxCount = 0;
        for(int j = 0; j < s.length(); j++){
            char ch = carr[j];
            arr[ch - 'A']++;
            maxCount = Math.max(maxCount, arr[ch - 'A']);

            while((j - i + 1) - maxCount > k){
                char ch2 = carr[i];
                arr[ch2 - 'A']--;
                i++;
            }

            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
