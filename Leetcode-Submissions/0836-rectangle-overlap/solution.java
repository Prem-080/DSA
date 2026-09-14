class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1];
        int x2 = rec1[2], y2 = rec1[3];
        
        int X1 = rec2[0], Y1 = rec2[1];
        int X2 = rec2[2], Y2 = rec2[3];

        return (x2 > X1 && y2 > Y1) && (x1 < X2 && y1 < Y2);

    }
}
