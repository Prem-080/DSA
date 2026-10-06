class Solution {
    public int minAddToMakeValid(String s) {
        int popen = 0, count = 0;
        for(char ch: s.toCharArray()){
            if(ch == ')') {
                if(popen == 0){
                    count++;
                }
                else{
                    popen--;
                }
            }
            else popen++;
        }
        if(popen != 0) count += popen;
        return count;
    }
}
