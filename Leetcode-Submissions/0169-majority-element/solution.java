class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int e = 0;
        for(int i = 0; i < nums.length; i++){
            if(c == 0){
                e = nums[i];
                c++;
            }
            else if(e == nums[i]){
                c++;
            }
            else if(e != nums[i]){
                c--;
            }
        }

        int c1 = 0;
        for(int i : nums){
            if(i == e){
                c1++;
            }
        }
        if(c1 > nums.length/2){
            return e;
        }
        return -1;
    }
}
