
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<Integer>();
        int i = 1, j = mountain.length - 2;
        while( i <= j ){
            if(mountain[i] > mountain[i + 1] && mountain[i] > mountain[i - 1]) peaks.add(i);
            i++;
        }
        return peaks;

    }
}
