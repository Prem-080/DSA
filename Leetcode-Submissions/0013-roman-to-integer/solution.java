class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        char[] arr = s.toCharArray();
        int ans = 0;
        
        for(int i = 1; i < arr.length; i++){
            int n1 = roman.get(arr[i - 1]), n2 = roman.get(arr[i]);
            if(n1 < n2){
                ans += n2 - n1;
                i++;
            }
            else{
                ans += n1;
            }
            System.out.println(ans);
        }
        if(arr.length > 1 && roman.get(arr[arr.length - 1]) <= roman.get(arr[arr.length - 2])) 
        ans += roman.get(arr[arr.length - 1]);
        else if(arr.length == 1)
        ans += roman.get(arr[0]);

        return ans;
        
    }
}
