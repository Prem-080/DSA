class Solution {
public:
    int findComplement(int num) {
        int flask = 0 , a = num;
         while(a != 0){
             flask = (flask << 1) | 1;
             
             a = a >> 1;
         }
        num = (~num) & flask;
        return num;
    }
};
