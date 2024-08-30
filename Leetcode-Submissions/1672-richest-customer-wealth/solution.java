class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for (int[] customer : accounts){

            int currentWealth = 0;

            for (int bank : customer) {

                currentWealth += bank;

            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentWealth);

        }

        return maxWealthSoFar;
    }
}
