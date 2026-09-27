class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temp.length];
        stack.push(temp.length - 1);
        ans[temp.length - 1] = 0;
        for (int i = temp.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - i;
            } else {
                ans[i] = 0;
            }
            stack.push(i);
        }
        return ans;
    }
}
