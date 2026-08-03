class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder res = new StringBuilder("");
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                if(level > 0){
                    res.append('(');
                }
                level++;
            }
            else{
                level--;
                if(level > 0){
                    res.append(')');
                }

            }
        }
        return res.toString();
    }
}
