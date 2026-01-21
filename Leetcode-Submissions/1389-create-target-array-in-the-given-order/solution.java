class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i = 0; i < target.length; i++){
            target[i] = -1;
        }
        for(int i = 0; i < index.length; i++){
            // insertion:
            insert(target, index[i] , nums[i], i);

        }
        return target;
    }
    static void insert(int[] target, int index, int value, int oIndex){
        if(target[index] != -1){        
            int prev = target[index];
            target[index] = value;
            for(int i = index + 1; i < oIndex + 1; i++){
                prev = prev + target[i];
                target[i] = prev - target[i];
                prev = prev - target[i];
            }
        }
        else{
            target[index] = value;
        }
    }
}
