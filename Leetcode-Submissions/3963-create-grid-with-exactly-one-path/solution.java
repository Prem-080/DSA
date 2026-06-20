class Solution {
    public String[] createGrid(int m, int n) {
        String[] str = new String[m];
        int i = 1, j = 0;
        StringBuilder s = new StringBuilder("");
        str[0] = "";
        while(j < n){
            str[0] += ".";
            if(j < n - 1){
                s.append("#");
            }
            j++;
        }
        
        while(i < m){
            str[i++] = s.toString() + ".";
        }

        return str;

        
        
        
    }
}
