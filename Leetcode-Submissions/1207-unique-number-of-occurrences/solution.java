class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int [] freq = new int[1001];
        int [] map = new int[2001];
        for(int i: arr) {
            freq[map[1000+i]]--;
            map[1000+i]++;
            freq[map[1000+i]]++;
        }

        for(int f: freq) {
            if(f > 1) {
                return false;
            }
        }
        return true;
    }
}
