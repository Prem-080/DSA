class Solution {
    public boolean check(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                x = i + 1;
                break;
            }

        }
        if (x == 0 || nums[0] >= nums[nums.length - 1]) {

            while (x < nums.length - 1) {
                if (nums[x] > nums[x + 1]) {
                    return false;
                }
                x++;
            }
            return true;
        }
        else{
            return false;
        }
    }

    
}
