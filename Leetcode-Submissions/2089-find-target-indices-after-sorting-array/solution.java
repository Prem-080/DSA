class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lcount = 0;
        int tcount = 0;
        for(int num: nums){
            if(num < target) lcount++;
            if(num == target) tcount++;
        }
        int endindx = lcount + tcount;
        List<Integer> res = new ArrayList<>();
        while(lcount < endindx){
            res.add(lcount++);
        }

    return res;
    }
}
