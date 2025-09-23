import java.util.*;

class Backtracking {
    static void GenSub(int arr[], List<Integer> li, int index) {
        if (index == arr.length) {
            System.out.println(li);
            return;
        }

        li.add(arr[index]);
        GenSub(arr, li, index + 1);

        li.remove(li.size() - 1);
        GenSub(arr, li, index + 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        List<Integer> li = new ArrayList<>();
        GenSub(arr, li, 0);
    }
}
