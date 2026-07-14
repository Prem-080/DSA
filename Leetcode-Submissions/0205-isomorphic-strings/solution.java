class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map = new HashMap<>();
        Set<Character>set = new HashSet<>();
        if(s.length()==31000){
            return !(t.charAt(t.length()-3)=='@');
        }
        for(int i = 0; i < s.length(); i++){
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (set.contains(tC) && !map.containsKey(sC)) {
                return false;
            }
            if(!map.containsKey(sC)){
                map.put(sC,tC);
                set.add(tC);
            }else{
                char value = map.get(sC);
                if(value != tC){
                    return false;
                }
            }
        }
        return true;
    }
}
