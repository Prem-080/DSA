class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();
        if(s.length() == t.length()){
            return s.equals(t);
        }
        for(char ch: s.toCharArray()){
            stack.push(ch);
        }
        
        for(int i = t.length() - 1; i >= 0; i--){
            char ch = t.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
