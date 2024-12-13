public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        //nums = [-2,1,-3,4,-1,2,1,-5,4]
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], nums[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
    
         return maxSum;
    }
}
