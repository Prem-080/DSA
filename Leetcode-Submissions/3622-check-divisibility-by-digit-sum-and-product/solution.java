class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0, digitProd = 1;
        int temp = n;
        while(n != 0){
            int x = n % 10;
            digitSum += x;
            digitProd *= x;
            n /= 10;
        }
        int sum = (digitSum + digitProd);
        int exp = temp % sum;
        if(exp == 0){
            return true;
        }
        return false;
    }
}
