class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        
        // Find the maximum value in quantities to define our upper bound
        for (int q : quantities) {
            if (q > right) {
                right = q;
            }
        }
        
        int result = right;
        
        // Perform binary search on the answer space
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canDistribute(n, quantities, mid)) {
                result = mid;       // mid is a feasible answer, try to find a smaller one
                right = mid - 1;
            } else {
                left = mid + 1;     // mid is too small, increase the lower bound
            }
        }
        
        return result;
    }
    
    // Helper function to check if we can distribute products with a max limit of 'maxProductsPerStore'
    private boolean canDistribute(int n, int[] quantities, int maxProductsPerStore) {
        int storesNeeded = 0;
        
        for (int q : quantities) {
            // Ceiling division of q by maxProductsPerStore
            storesNeeded += (q + maxProductsPerStore - 1) / maxProductsPerStore;
            
            // Optimization: If stores needed already exceed n, return false early
            if (storesNeeded > n) {
                return false;
            }
        }
        
        return storesNeeded <= n;
    }
}
