public class ReverseOfArray {

    // Function to reverse array
    static int reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return 0; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Call the function
         reverseArray(arr);

        // Print the reversed array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}








