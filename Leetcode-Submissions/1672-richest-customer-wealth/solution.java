class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] acc: accounts){
            int sumOfWealth = 0;
            for(int i: acc){
                sumOfWealth += i;
            }
            if(maxWealth < sumOfWealth){
                maxWealth = sumOfWealth;
            }
        }
        return maxWealth;
    }

}
