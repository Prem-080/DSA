class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        else if(x < 10){
            return true;
        }
        else{
            int temp = x;
            int rev = 0;
            while(temp > rev){
                if(rev > Integer.MAX_VALUE/10){
                    return false;
                }
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if(temp == rev || temp == rev / 10){
                return true;
            }
            return false;
        }
    }
}
