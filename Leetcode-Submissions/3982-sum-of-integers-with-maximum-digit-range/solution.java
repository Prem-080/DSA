class Solution {
    public int maxDigitRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[][] arr = new int[100][2];
        for(int i = 0; i < nums.length; i++){
            int[] arr1 = find(nums[i]);
            arr[i][0] = arr1[0];
            arr[i][1] = arr1[1];
            if(max < arr1[0] - arr1[1]){
                max = arr1[0] - arr1[1];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(arr[i][0] - arr[i][1] == max){
                sum += nums[i];
            }
        }
        return sum;
    }

    int[] find(int n){
        int l = -1, s = 10;
        while(n != 0){
            int x = n % 10;
            if(x > l){
                l = x;
            }
            if(x < s){
                s = x;
            }
            n /= 10;
        }

        return new int[]{l, s};
        
    }
}
