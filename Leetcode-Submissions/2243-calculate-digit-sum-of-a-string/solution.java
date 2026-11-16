class Solution {
    public String digitSum(String s, int k) {
        int curr = 0;
        int temp = k;
        StringBuilder prev = new StringBuilder(s);
        while (prev.length() > temp) {
            StringBuilder next = new StringBuilder();
            for (char ch : prev.toString().toCharArray()) {
                
                int digit = ch - '0';
                curr += digit;
                k--;
                if (k == 0) {
                    next.append(curr);
                    curr = 0;
                    k = temp;
                }

            }
            if (k < temp) {
                next.append(curr);
                k = temp;
                curr = 0;
            }
            prev = next;
        }
        return prev.toString();
    }
}
