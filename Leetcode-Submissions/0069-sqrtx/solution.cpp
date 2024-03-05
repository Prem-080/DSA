int sqrt(int x){
    int s = 0;
    int e = x;
    long long int mid = s + (e - s)/2;
    
    int ans = -1;
    while(s <= e){
        long long int sqr = mid * mid;
   
        if(sqr == x){
         return mid;
    }
       else if ( sqr < x){
           ans  = mid;
           s = mid + 1;
       }
        else{
            e = mid - 1;
        }
        mid = s + (e - s)/2;
    }
    return ans;
    
}

class Solution {
public:int mySqrt(int x) {
             return sqrt(x);
    
  }  
};
