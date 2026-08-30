class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int t = 0, f = 0, i = 0, res = 0;
        for(int j = 0; j < answerKey.length(); j++){
            char ch = answerKey.charAt(j);
            if(ch == 'T')t++;
            else f++;

            while(t > k && f > k){
                char ch2 = answerKey.charAt(i);
                if(ch2 == 'T')t--;
                else f--;
                i++;
            }

            res = Math.max(res, j - i+ 1);
        }
        return res;
    }
}
