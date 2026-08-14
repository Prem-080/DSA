class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] > 0){ // if the 1st index is a positive number then adding all pos numbers don't yield to 0.
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]){ // skipping duplicate value;
                continue;
            }
            
            int j = i+1, k = nums.length-1; 
            while(j < k){ // 2 pointers
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum < 0){ // if sum is smaller then we need to increase the left pointer for higher sum.
                    j++;
                }
                else if (sum > 0){ // if sum is greater then we need to decrease the right pointer for lower sum.
                    k--;
                }
                else{ // if the sum is 0 add it to the result.
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while(j < k){ // skip duplicate values from left to right
                        j++;
                        if(nums[j] != nums[j-1]) break;
                    }

                    while(j < k){ // skip duplicates from right to left.
                        k--;
                        if(nums[k] != nums[k+1]) break;
                    }
                }
            }
        }
        return result;
    }
}
