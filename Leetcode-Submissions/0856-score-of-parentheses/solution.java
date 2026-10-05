class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                stack.push(res);
                res = 0;
            }
            else{
                if(res == 0){
                    res = stack.pop() + 1;
                }
                else{
                    res = stack.pop() + 2 * res;
                }
            }

        }
        return res;
    }
}
