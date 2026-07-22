class Solution {
    public int findComplement(int num) {
        String s = new String();
        int temp = num;
        while(temp != 0){
            s =(temp % 2 == 1 ? 0 : 1) + s;
            temp /= 2;
        }
        int res = 0, n = s.length();
        System.out.println(s);
        for(char c: s.toCharArray()){
            int x = c - '0';
            res = res + x * (int)Math.pow(2, n - 1);
            n--;
        }

        return res;
    }
}
