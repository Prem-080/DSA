class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st = 0, en = letters.length - 1, ans = 0;
        while(st <= en){
            int mid = st + (en - st)/2;
            if(letters[mid] <= target){
                st = mid + 1;
            }
            else if(letters[mid] > target){
                en = mid - 1;
            }
            ans = st % (letters.length);
        }
        return letters[ans];
    }
}
