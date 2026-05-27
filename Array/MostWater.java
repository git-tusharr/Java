public class MostWater {

    // Function to find maximum water container area
    public static int maxArea(int[] height) {

        // Pointer starting from left side
        int left = 0;

        // Pointer starting from right side
        int right = height.length - 1;

        // Variable to store maximum water found
        int maxWater = 0;

        // Loop until both pointers meet
        while (left < right) {

            // Width between two lines
            int width = right - left;

            // Height of container depends on smaller line
            int minHeight = Math.min(height[left], height[right]);

            // Area = width × height
            int currentArea = width * minHeight;

            // Update maximum area if current area is bigger
            maxWater = Math.max(maxWater, currentArea);

            /*
             Move the pointer having smaller height
             
             Why?
             Because smaller height limits the water storage.
             We try to find a taller line to increase area.
            */

            if (height[left] < height[right]) {

                // Move left pointer to right
                left++;

            } else {

                // Move right pointer to left
                right--;
            }
        }

        // Return the maximum water stored
        return maxWater;
    }

    public static void main(String[] args) {

        // Input array
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Call function and store answer
        int result = maxArea(height);

        // Print final answer
        System.out.println("Maximum Water Stored = " + result);
    }
}