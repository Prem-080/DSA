class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // if(p.length() > s.length()) return ;
        int[] arr = new int[27];
        for(char ch: p.toCharArray()){
            int indx = ch - 'a';
            arr[indx]++;
        }
        int len = 0;
        char[] carr = s.toCharArray();
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();
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
                if(len == p.length()){
                    res.add(i);
                    len--;
                    arr[carr[i] - 'a']++;
                    i++;
                }
            }
        }
        return res;
        
    }
}
