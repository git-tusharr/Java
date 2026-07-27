import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        // Traverse twice to simulate circular array
        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                ans[stack.pop()] = curr;
            }

            // Push indices only during first pass
            if (i < n) {
                stack.push(i);
            }
        }

        return ans;
    }
}