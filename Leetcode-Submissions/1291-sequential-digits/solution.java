class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls = new ArrayList<>();
        int d1 = digits(low);
        int d2 = digits(high);
        int i = 1;
        while (i <= 10 - d1) {
            int num = i;
            int temp = i;
            while (num < high && temp < 9) {
                num = num * 10 + ++temp;
                if (num >= low && num <= high) {
                    ls.add(num);
                }
            }
            i++;
        }
        Collections.sort(ls);
        return ls;
    }


    int digits(int n) {
        int x = 0;
        while (n != 0) {
            n /= 10;
            x++;
        }
        return x;
    }
}
