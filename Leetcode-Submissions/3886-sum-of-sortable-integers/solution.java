class Solution {
    public int sortableIntegers(int[] nums) {
        // possibile divisors of n
        int n = nums.length;
        List<Integer> div = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                div.add(i);
        }

        int[] s = nums.clone();
        Arrays.sort(s);

        // for k = 1
        int sum = 0;
        if (isSorted(nums, s, 0, n)) {
            for (int i : div) {
                sum += i;
            }
            return sum;
        }

        for (int i = 1; i < div.size(); i++) {
            int k = div.get(i);
            // for each k check every block
            int j = 0;
            boolean isSortable = true;
            while (j < n) {

                if (!isSorted(nums, s, j, j + k)) {
                    // check if can be rotated and sorted?
                    if (!check(nums, s, j, j + k)) {
                        isSortable = false;
                        break;
                    }
                }
                j += k;

            }
            if (isSortable)
                sum += k;
        }
        return sum;

    }

    boolean isSorted(int[] nums, int[] s, int i, int j) {
        while (i < j) {
            if (nums[i] != s[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public boolean check(int[] nums, int[] s, int j, int n) {
        int drops = 0;
        int rotationPoint = -1;

        for (int i = j; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                drops++;
                rotationPoint = i + 1;
                if (drops > 1)
                    return false;
            }
        }

        // No rotation needed
        if (drops == 0) {
            for (int i = j; i < n; i++) {
                if (nums[i] != s[i])
                    return false;
            }
            return true;
        }

        // Check the block in cyclically rotated order
        int len = n - j;
        for (int i = 0; i < len; i++) {
            int idx = j + (rotationPoint - j + i) % len;
            if (nums[idx] != s[j + i])
                return false;
        }

        return true;
    }
}
