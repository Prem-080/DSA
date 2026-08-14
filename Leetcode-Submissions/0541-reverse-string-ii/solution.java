class Solution {
    public String reverseStr(String s, int k) {
        // l = 0, r = k - 1
        // reverse s[l] -- s[r]
        // l = 1, r = 0 => l += k + 1, r = l + k
        char[] chars = s.toCharArray();
        System.out.println(s.length());
        for(int i = 0; i < chars.length; i++){
            // reverse i to k - 1
            int l = i, r = i + k - 1;
            if(r >= chars.length){
                r = chars.length - 1;
            }
            while(l <= r){
                char temp = chars[l];
                chars[l++] = chars[r];
                chars[r--] = temp;
            }
            l += k/2 - 1;
            i = l + k;            
        }
        return new String(chars);
    }
}
