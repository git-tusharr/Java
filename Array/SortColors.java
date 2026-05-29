public class SortColors {

    // Function to sort the array containing 0s, 1s, and 2s
    public static void sortColors(int[] nums) {

        // low -> position where next 0 should go
        int low = 0;

        // mid -> current element being checked
        int mid = 0;

        // high -> position where next 2 should go
        int high = nums.length - 1;

        // Continue until mid crosses high
        while (mid <= high) {

            // CASE 1: Current element is 0
            if (nums[mid] == 0) {

                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                // Move both pointers forward
                low++;
                mid++;
            }

            // CASE 2: Current element is 1
            else if (nums[mid] == 1) {

                // 1 is already in correct middle section
                // Just move mid forward
                mid++;
            }

            // CASE 3: Current element is 2
            else {

                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                // Move high backward

                // NOTE:
                // We DO NOT move mid here
                // because the swapped element from high
                // needs to be checked again
                high--;
            }
        }
    }

    // Main method -> program starts here
    public static void main(String[] args) {

        // Example input array
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Call sorting function
        sortColors(nums);

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}