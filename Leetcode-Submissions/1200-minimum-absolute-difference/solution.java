class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    
        quickSort(arr,0,arr.length-1);
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            minDiff = Math.min(arr[i]-arr[i-1],minDiff);
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i]-arr[i-1] == minDiff){
                List<Integer> p = new ArrayList<>();
                p.add(arr[i-1]);
                p.add(arr[i]);
                ans.add(p);
            }
        }
        return ans;
    }

    public static void quickSort(int[] arr,int start,int end){
        if(start >= end) return;
        int low = start;
        int high = end;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];

        while(low <= high){
            while(arr[low] < pivot)
                low++;
            while(arr[high]>pivot)
                high--;

            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        quickSort(arr,start,high);
        quickSort(arr,low,end);
    }
}
