class Solution {
    public boolean validDigit(int n, int x) {
        int c=n;
        while(c>=10){
            c/=10;
        }
        if(c==x) return false;
        while(n>0){
            if(n%10==x) return true;
            n/=10;
        }
        return false;
    }
}
