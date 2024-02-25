class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;

        for(int i = 0; i<nums.size(); ++i){

            int valueAtI = abs(nums[i]); // getting the absolute value at i, as it might be negative

            if(nums[valueAtI-1] < 0){

                ans.push_back(valueAtI);

            }

            nums[valueAtI-1] = nums[valueAtI-1] * -1;

        }

        return ans;
    }
};
