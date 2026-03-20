class Solution {
    public int hammingWeight(int n) {
        //Brute Force Approach
        // int count= 0;
        // int temp = n;
        // while(temp > 0){
        //     count += temp & 1;
        //     temp >>= 1;
        // }
        // return count;

        //brian kernighan’s algorithm
        int temp = n, count = 0;
        while(temp > 0){
            temp = temp & (temp - 1);
            count++;
        }
        return count;

    }
}
