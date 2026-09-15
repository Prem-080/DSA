class Solution {
    public int maxPalindromes(String s, int k) {
        int i = 0, count = 0;
        int n = s.length();
        for (int j = k - 1; j < n; ++j) {
            int l = j - k + 1;
            if(l >= i && isPalindrome(s, l, j)){
                ++count;
                i = j + 1;
                continue;
            }
            l = j - k;
            if(l >= i && isPalindrome(s, l, j)){
                count++;
                i = j + 1;
            }

        }

        return count;

    }

    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
