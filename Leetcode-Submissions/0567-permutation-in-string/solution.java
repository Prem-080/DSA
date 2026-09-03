class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] arr = new int[27];
        for(char ch: s1.toCharArray()){
            int indx = ch - 'a';
            arr[indx]++;
        }
        int len = 0;
        char[] carr = s2.toCharArray();
        int i = 0, j = 0;
        for(char ch: carr){
            if(arr[ch - 'a'] == 0){
                while(carr[i] != ch){
                    arr[carr[i] - 'a']++;
                    len--;
                    i++;
                }
                i++;
            }
            else{
                len++;
                arr[ch - 'a']--;
                if(len == s1.length()){
                    return true;
                }
            }
        }
        return false;

                

    }
}
