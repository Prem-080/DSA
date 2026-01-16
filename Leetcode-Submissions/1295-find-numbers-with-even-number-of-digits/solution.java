class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num: nums){
            if(evenDigits(num)){
                evenCount++;
            }
        }
        return evenCount;
    }

    boolean evenDigits(int num){
         if(num < 0){
            num = num * -1;
        }
        if(num == 0) return false;
        int count = (int) Math.log10(num) + 1;
        return count % 2 == 0;
    }
}
