class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int count = 0, max = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0)
                count++;

            if (count == k) {
                max++;
                int l = i;
                while (nums[l] % 2 == 0) {
                    max++;
                    l++;
                }
                // System.out.println(max);
            } else if (count > k) {
                // System.out.println("Inside else if " + count + " " + max);
                while (i <= j && nums[i] % 2 == 0)
                    i++;
                i++;
                count--;
                if (count == k) {
                    max++;
                    int l = i;
                    while (nums[l] % 2 == 0) {
                        max++;
                        l++;
                    }
                }
            }

        }
        return max;
    }
}
