class Solution {
public:
    int hammingWeight(uint32_t n) {
        int i;
          for(i =0;n != 0;n = n >> 1)
        {
        // checking last bit
        if (n & 1)
        {
            i++;
        }
    }
        return i;
    }
};
