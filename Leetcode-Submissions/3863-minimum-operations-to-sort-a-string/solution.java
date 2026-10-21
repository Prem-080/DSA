class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        ;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted)
            return 0;

        if (n == 2)
            return -1;

        char mn = s.charAt(0);
        char mx = s.charAt(0);
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < mn)
                mn = c;
            if (c > mx)
                mx = c;
        }
        //case 1:min or max ele present at beginnig or ending return 1;
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        //case 2: min or max ele pres in middle of string return 2;
        boolean minInMiddle = false;
        boolean maxInMiddle = false;

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn)
                minInMiddle = true;
            if (s.charAt(i) == mx)
                maxInMiddle = true;
        }

        if (minInMiddle || maxInMiddle)
            return 2;
        //case 3: min pres at max and max at min and no duplicates then return 3;
        return 3;

    }
}
