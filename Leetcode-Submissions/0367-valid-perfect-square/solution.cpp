bool sqrt(int x){
    int s = 1;
    int e = x;

    long long int mid = s + (e - s)/2;

    while(s <= e){

        long long int sqr = mid * mid;
        if(sqr == x){

         return 1;

    }

       else if ( sqr < x){

           s = mid + 1;

       }

        else{

            e = mid - 1;

        }

        mid = s + (e - s)/2;

    }

    return 0;

    

}

class Solution {
public:
    bool isPerfectSquare(int num) {
        return sqrt(num);
    }
};
