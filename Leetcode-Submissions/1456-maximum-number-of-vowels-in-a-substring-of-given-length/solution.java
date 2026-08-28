class Solution {
    public int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int i = 0, j = 0;
        for( ; j < s.length(); j++){
            char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

            if(j - i + 1 == k){
                max = Math.max(count, max);
                char ch1 = s.charAt(i);
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                    count--;
                }
                i++;
            }
        }
        return max;
    }
}
