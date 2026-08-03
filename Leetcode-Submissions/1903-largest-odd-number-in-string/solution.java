class Solution {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        char[] digits = num.toCharArray();
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            System.out.println(digits[i]);
            if (digits[i] % 2 == 0) {
                i--;
            } else {

                break;
            }
        }
        for (int j = 0; j <= i; j++) {
            res.append(digits[j]);
        }
        return res.toString();
    }
}
