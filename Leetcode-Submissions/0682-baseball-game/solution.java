class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for(String s: operations){
            if(s.equals("C")){
                sum -= stack.pop();
            }
            else if(s.equals("D")){
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            }
            else if(s.equals("+")){
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
                sum += stack.peek();
                
                
            }
            else{
                stack.push(Integer.parseInt(s));
                sum+=stack.peek();
            }
        }
       

        return sum;
    }
}
