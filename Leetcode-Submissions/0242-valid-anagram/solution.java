class Solution {
    
    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        int n = s.length(),m=t.length();
        if(n!=m) return false;
        for (char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch: t.toCharArray()) {
            freq[ch - 'a']--;
            if(freq[ch - 'a'] < 0) return false;
        }
        return true;
    }
}
