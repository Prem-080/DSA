class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder("");

        Arrays.sort(strs);

        int n = strs.length;
        String first = strs[0];
        String last = strs[n - 1];

        for(int i = 0; i < first.length(); i++){
            char c1 = first.charAt(i), c2 = last.charAt(i);
            if(c1 != c2) break;
            ans.append(c1);
        }
        return ans.toString();

    }
}
