class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Create buckets
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        // 3. Put each number into its frequency bucket
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // 4. Traverse from highest frequency to lowest
        int[] res = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >= 1; freq--) {

            if (buckets[freq] == null) {
                continue;
            }

            for (int num : buckets[freq]) {
                res[index++] = num;

                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
