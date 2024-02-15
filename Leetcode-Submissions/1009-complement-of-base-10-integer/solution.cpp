class Solution {
public:
    int bitwiseComplement(int num) {
           int flask = 0 , a = num;

        if(num == 0) return 1; 
         while(a != 0){

             flask = (flask << 1) | 1;

             

             a = a >> 1;

         }

        num = (~num) & flask;

        return num;
    }
};
