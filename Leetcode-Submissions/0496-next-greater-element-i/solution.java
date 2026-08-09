class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = nums2.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            int greater = stack.isEmpty() ? -1 : stack.peek();
            mp.put(nums2[i], greater);
            stack.push(nums2[i]);
        }
         // Get answers for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = mp.get(nums1[i]);
        }

        return ans;
    }
}
