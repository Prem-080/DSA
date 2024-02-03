class Solution {
public:
   bool isPalindrome(int x)
{
    
        if (x < 0)
    {
        return 0;
    }
       int rev = 0;
    for (int a = x;a!=0;a/=10)
    {
        if(rev > INT_MAX/10){
            return 0;
        }
        rev = (rev * 10) + (a % 10);
    }
    if (rev == x)
    {
        return 1;
    }
    return 0;
}
};
