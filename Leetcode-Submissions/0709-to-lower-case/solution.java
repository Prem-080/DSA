class Solution {
    public String toLowerCase(String s) {
        char[] lower = s.toCharArray();
        for(int i = 0; i < lower.length; i++){
            
            if(lower[i] >= 'A' && lower[i] <= 'Z') lower[i] += 32;

        }
        return new String(lower);
    }
}
