
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int n1, int n2) {
        long cost = 0;
        int sum = cost1 + cost2;

        if (sum > costBoth) {
            if (n1 > n2) {
                if (cost1 >= costBoth) {
                    cost = (long) n1 * costBoth;
                } else {
                    cost = (long) n2 * costBoth
                         + (long) (n1 - n2) * cost1;

                    long c3 = (long) n2 * cost2
                            + (long) cost1 * n1;

                    if (cost > c3) cost = c3;
                }
            } else {
                if (cost2 >= costBoth) {
                    cost = (long) n2 * costBoth;
                } else {
                    cost = (long) n1 * costBoth
                         + (long) (n2 - n1) * cost2;

                    long c3 = (long) n2 * cost2
                            + (long) cost1 * n1;

                    if (cost > c3) cost = c3;
                }
            }
        } else {
            cost = (long) n1 * cost1 + (long) n2 * cost2;
        }

        return cost;
    }
}

