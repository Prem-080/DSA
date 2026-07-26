class Solution {
    public int largestInteger(int n, int s) {
        int len = 1;
        int temp = n;
        while(temp != 0){
            len *= 10;
            temp--;
        }
        if((int) Math.log(len) != n - 1){
            len--;
        }
        for(int j = len; j >= 0; j--){
            int sum = 0;
            int i = j;
            while(i != 0){
                sum += i % 10;
                i /= 10;
            }
            if(sum == s) return j;
        }
        return -1;
    }
}
