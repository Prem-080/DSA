class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // no. of occurence of each character in jewels in stones.
        int count = 0;
        for(char c1: jewels.toCharArray()){
            for(char c2: stones.toCharArray()){
                if(c1 == c2){
                    count++;
                }
            }
        }
        return count;
    }
}
