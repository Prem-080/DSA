class Solution {
    public String countAndSay(int n) {
            int i = 1;
            StringBuilder s = new StringBuilder("1");
            while(i < n){
                s = RLE(s.toString());
                i++;
            }
            return s.toString();
    }

    static StringBuilder RLE(String s){
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int count = 1;
        char prev = arr[0];

        for(int i = 1; i < len; i++){
            if(arr[i - 1] == arr[i]){
                count++;
            }
            else{
                res.append(count);
                res.append(prev);
                count = 1;
                prev = arr[i];
            }
        }
        res.append(count);
        res.append(prev);
        return res;
    }
}
