class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for(int i: costs) max = max < i ? i : max;

        int[] freq = new int[max + 1];

        for(int i: costs) freq[i]++;
        int maxI = 0;
        for(int coin = 1; coin < freq.length && coin <= coins; coin++){
            int buy = freq[coin] < coins / coin ? freq[coin] : coins / coin;
            coins -= coin * buy;
            maxI += buy;
            
        }

        return maxI;
    }
}
