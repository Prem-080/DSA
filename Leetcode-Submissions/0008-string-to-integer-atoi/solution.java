class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        boolean sign = false;
        int n = s.length();
        if (n == 0)
            return 0;
        char ch = s.charAt(0);
        int i = 0;
        while (i < n && ch == ' ') {
            i++;
            if (i < n) {
                ch = s.charAt(i);
            } else
                return 0;
        }
        if (i < n && s.charAt(i) == '-') {
            sign = true;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }
        if (i < n)
            ch = s.charAt(i);
        else
            return 0;
        while (i < n && !(ch - '0' >= 0 && ch - '0' <= 9)) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch == '.') || (ch == ' ') || (ch == '+')
                    || (ch == '-'))
                return 0;
            i++;
            if (i < n)
                ch = s.charAt(i);
            else
                return 0;
        }
        while (i < n && (ch - '0' >= 0 && ch - '0' <= 9)) {
            int x = ch - '0';
            ans = ((long) (ans * 10) + x);
            if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
                if (sign)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            if (i + 1 < n) {
                ch = s.charAt(++i);
            } else {
                break;
            }
        }
        if (sign)
            ans *= -1;

        return (int) ans;

    }
}
