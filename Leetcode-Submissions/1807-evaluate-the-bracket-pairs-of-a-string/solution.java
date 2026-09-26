class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mp = new HashMap<>();
        for(List<String> k: knowledge){
            mp.put(k.get(0), k.get(1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                String key = new String();
                i++;
                ch = s.charAt(i);
                while(ch != ')'){
                    key += ch;
                    i++;
                    ch = s.charAt(i);
                }
                
                sb.append(mp.getOrDefault(key, "?"));
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}
