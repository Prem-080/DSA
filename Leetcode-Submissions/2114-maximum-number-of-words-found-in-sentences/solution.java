class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(int i = 0; i < sentences.length; i++){
            int s = 0;
            for(char ch: sentences[i].toCharArray()){
                if(ch == ' ') s++;
            }
            if(max < s + 1) max = s + 1;
        }
        return max;
    }
}
