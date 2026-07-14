class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int dist = 0, cL = 0, cR = 0, c_ = 0;
        for(int i = 0; i < moves.length(); i++){

            char ch = moves.charAt(i);
            if(ch == 'L'){
                cL += 1;
            }
            else if(ch == 'R'){
                cR += 1;
            }
            else{
                c_ += 1;
            }
        }   

        return Math.abs(cR - cL) + c_;
    }
}
