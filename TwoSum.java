import java.util.HashMap;

class TwoSum {

    public static void main(String[] args) {
        // Input: nums = [2,7,11,15], target = 9
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];

            if (hashmap.containsKey(complement)) {
                return new int[] { hashmap.get(complement), i };
            }
            hashmap.put(nums[i], i);

        }
        return null;
    }
}