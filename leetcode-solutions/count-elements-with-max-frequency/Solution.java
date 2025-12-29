import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countElementsWithMaxFrequency(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFreq = 0;
        for (int v : freq.values()) {
            if (v > maxFreq) maxFreq = v;
        }

        int count = 0;
        for (int v : freq.values()) {
            if (v == maxFreq) count++;
        }

        return count;
    }
}
