class Solution {
    class Pair {
        int freq;
        char ch;
        int dig;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Pair(int dig, int freq) {
            this.dig = dig;
            this.freq = freq;
        }
    }

    public String frequencySort(String s) {
        Pair[] freq = new Pair[128];

        for (int i = 0; i < 128; i++) {
            freq[i] = new Pair((char) i, 0);
        }

        for (char ch : s.toCharArray()) {
            freq[ch].freq++;
        }

        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq)
                return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });

        StringBuilder result = new StringBuilder();
        for (Pair p : freq) {
            if (p.freq == 0)
                break;
            while (p.freq != 0) {
                result.append(p.ch);
                p.freq--;
            }
        }
        return result.toString();

    }
}
