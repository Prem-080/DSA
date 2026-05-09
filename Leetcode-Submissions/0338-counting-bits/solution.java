class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            ans[i] = hammingWeight(i);
        }
        return ans;
        
    }

    int hammingWeight(int n){
        int count;
        for (count=0; n != 0; count++)
            n &= n - 1;
        return count;
    }

}
