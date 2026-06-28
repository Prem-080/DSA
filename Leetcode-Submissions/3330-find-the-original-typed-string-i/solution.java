class Solution {
    public int possibleStringCount(String word) {
        int res = 1;
        for(int i = 1; i < word.length(); i++){
            char ch1 = word.charAt(i - 1);
            char ch2 = word.charAt(i);
            if(ch1 == ch2){
                res++;
            }

        }
        return res;
    }
}
