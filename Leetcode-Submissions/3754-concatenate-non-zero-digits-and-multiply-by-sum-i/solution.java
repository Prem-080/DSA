class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0, nonzero = 0;
int i = 0;
        while(n !=0){
            if(n %10 != 0){
                
            
            nonzero = (n % 10) * (long)Math.pow(10, i) + nonzero ;
sum += n %10;
                i++;
            }
            n /= 10;
        }
        return nonzero * sum;
        
    }
}
