class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        Map<Integer, Integer> mp = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < n; i++){
            if(mp.getOrDefault(temp[i], 0) == 0){
                mp.put(temp[i], rank);
                rank++;
            }
        }
        for(int i = 0; i < n ; i++){
            arr[i] = mp.get(arr[i]);
        }
        return arr;

    }
}
