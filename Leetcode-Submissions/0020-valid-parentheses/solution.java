class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            boolean isEmpty = stack.isEmpty();
            if(ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else{
                if(isEmpty){
                    return false;
                }
                if(ch == ')' && stack.peek() == '(') stack.pop();
                else if(ch == ']' && stack.peek() == '[') stack.pop();
                else if(ch == '}' && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}

