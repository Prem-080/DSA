class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
          for(n;n!=0;n/=10){
           int a = n % 10;
           sum = sum + a;
           product = product * a;
           }
         int result = product - sum;
       return result;
    }
};
