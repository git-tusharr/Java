public class MaxSubArray {

    // Function to find maximum subarray sum
    public static int maxSubArray(int[] nums) {

        // currentSum stores sum of current subarray
        int currentSum = nums[0];

        // maxSum stores the maximum sum found so far
        int maxSum = nums[0];

        // Start loop from index 1 because index 0 is already used
        for (int i = 1; i < nums.length; i++) {

            /*
             Two choices:
             
             1. Start a new subarray from current element
                nums[i]

             2. Continue previous subarray
                currentSum + nums[i]

             Take whichever is larger
            */
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return final maximum subarray sum
        return maxSum;
    }

    // Main method to test the program
    public static void main(String[] args) {

        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call function and store answer
        int result = maxSubArray(nums);

        // Print result
        System.out.println("Maximum Subarray Sum = " + result);
    }
}