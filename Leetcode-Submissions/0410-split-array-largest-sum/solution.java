class Solution {

    boolean feasible(int threshold, int[] arr, int k){
        int count = 1;
        int sum = 0;    
        for(int num: arr){
            if(sum + num <= threshold){
                sum += num;
            }
            else{
                if(count >= k){
                    return false;
                }
                sum = num;
                count++;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int max = -1, sum = 0;
        for(int num: nums){
            if(num > max) max = num;
            sum+=num;
        }
        int l = max, r = sum;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(feasible(mid, nums, k)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;

    }
}
