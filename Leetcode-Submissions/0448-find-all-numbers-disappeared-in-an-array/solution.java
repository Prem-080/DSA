class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        List<Integer> res = new ArrayList<>();
        while(i < arr.length){
            if(arr[i] == i + 1){
                i++;
            }
            else{
                if(arr[i] == arr[arr[i] - 1]){
                    i++;
                }
                else{
                    swap(arr, arr[i] - 1, i);
                }
            }
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                res.add(i + 1);
            }
        }

        return res;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
