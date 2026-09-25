class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {

                stack.push(ch);
            }
        }
        Stack<Character> stack2 = new Stack<>();
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            } else {

                stack2.push(ch);
            }
        }


        return stack.equals(stack2);
        
    }
}
