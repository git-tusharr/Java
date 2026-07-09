class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] requirements) {

        int[] need = new int[n + 1];
        java.util.Arrays.fill(need, -1);

        for (int[] r : requirements) {
            int len = r[0] + 1;
            if (need[len] != -1 && need[len] != r[1]) {
                return 0;
            }
            need[len] = r[1];
        }

        if (need[1] != -1 && need[1] != 0) return 0;

        int maxInv = n * (n - 1) / 2;

        long[][] dp = new long[n + 1][maxInv + 1];
        dp[0][0] = 1;

        for (int len = 1; len <= n; len++) {

            long[] prefix = new long[maxInv + 1];
            prefix[0] = dp[len - 1][0];
            for (int i = 1; i <= maxInv; i++) {
                prefix[i] = (prefix[i - 1] + dp[len - 1][i]) % MOD;
            }

            for (int inv = 0; inv <= maxInv; inv++) {
                int left = inv - (len - 1);

                long ways = prefix[inv];
                if (left > 0) {
                    ways = (ways - prefix[left - 1] + MOD) % MOD;
                }

                dp[len][inv] = ways;
            }

            if (need[len] != -1) {
                for (int inv = 0; inv <= maxInv; inv++) {
                    if (inv != need[len]) {
                        dp[len][inv] = 0;
                    }
                }
            }
        }

        long ans = 0;
        for (int inv = 0; inv <= maxInv; inv++) {
            ans = (ans + dp[n][inv]) % MOD;
        }

        return (int) ans;
    }
}