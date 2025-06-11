public class MulitpleMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 9};
        int size = arr.length;

        for (int i = 0; i < size - 1; ++i) {
            for (int j = arr[i] + 1; j < arr[i + 1]; ++j) {
                System.out.println(j);
            }
        }
    }
}
