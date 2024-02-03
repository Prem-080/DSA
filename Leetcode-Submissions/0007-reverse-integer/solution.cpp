class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        for(int a = x;a!=0;a/=10){
            if(rev > INT_MAX/10||rev<INT_MIN/10){return 0;}
            rev = rev * 10 + a %10;
        }
        return rev;
    }
};
