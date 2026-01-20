class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int total = sum(nums);
        
       int leftSum = 0;
       
        for(int i = 0; i < nums.size(); i++){
          total -= nums[i];
           if(leftSum ==  total){
               return i;
           }
        leftSum += nums[i];
        }
       return -1;
    }
    int sum(vector<int>& nums){
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum+=nums[i];
        }
        return sum;
    }
};
