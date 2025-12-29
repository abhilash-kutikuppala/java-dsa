import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sums = target - nums[i];
            if (numMap.containsKey(sums)) {
                return new int[]{numMap.get(sums), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
