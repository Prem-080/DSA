import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>(); // unique elements (5): frequencies
        // ArrayList<Integer> seen = new ArrayList<>();
        // int[] values = new int[freq.size()];
        for(int i: arr){
            // if(freq.containsKey(i)){
            //     freq.put(i, freq.get(i) + 1);
            //     continue;
            // }
            // freq.put(i,1);
            freq.put(i, freq.getOrDefault(i, 0) + 1); 
            
        }

        HashSet<Integer> set = new HashSet<>(freq.values());
        return freq.size() == set.size();


        //check if all are unique.
        // for(int value: freq.values()){
        //     if(seen.contains(value)) return false;
        //     seen.add(value);
        // }

        // [0, 0] 0-0 = 0
        // for(int i = 0; i < values.length - 1; i++){
        //     if(values[i] - values[i + 1] == 0) return false;
        // }

        // return true;

    }
}
