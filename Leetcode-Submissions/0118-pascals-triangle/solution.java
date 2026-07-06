class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            pas.add(new ArrayList<>());
            pas.get(i).add(1);
            for (int j = 1; j < i; j++) {
                int val = pas.get(i - 1).get(j) + pas.get(i - 1).get(j - 1);
                pas.get(i).add(val);
            }
            if (i > 0) {
                pas.get(i).add(1);
            }
        }
        return pas;
    }
}
