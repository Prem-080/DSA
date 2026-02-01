/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakElementIndex(mountainArr);
        int ans = binarySearch(mountainArr, target, 0, peakIndex);
        if(ans == -1){
            ans = binarySearch(mountainArr, target, peakIndex, mountainArr.length() - 1);
        }
        return ans;        
    }
    int binarySearch(MountainArray mArr, int target, int s, int e){
        int peak = s;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(mArr.get(mid) == target){
                return mid;
            }
            else if(mArr.get(mid) > target){
                if(peak == 0){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            } 
            else{
                if(peak == 0){
                    s = mid + 1;
                    
                }
                else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    int peakElementIndex(MountainArray mountainArr){
        int st = 0, en = mountainArr.length() - 1;
        while(st < en){
            int mid = st + (en - st)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                en = mid;
            }
            else{
                st = mid + 1;
            }
        }
        return st;
    }
}
