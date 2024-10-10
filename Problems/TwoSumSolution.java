package Problems;

import java.util.HashMap;
import java.util.Map;


class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement))
                return new int[] {map.get(complement), i};

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
    //O(N) time complexity
    //O(N) space complexity
    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    //O(N^2) time complexity
    //O(1) space complexity
}