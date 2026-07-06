class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        // Knight must start at top-left corner
        if (grid[0][0] != 0) {
            return false;
        }

        // pos[i] = {row, col} where move number i occurs
        int[][] pos = new int[n * n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int move = grid[i][j];
                pos[move][0] = i;
                pos[move][1] = j;
            }
        }

        // Check every consecutive move
        for (int i = 1; i < n * n; i++) {
            int r1 = pos[i - 1][0];
            int c1 = pos[i - 1][1];
            int r2 = pos[i][0];
            int c2 = pos[i][1];

            int dr = Math.abs(r1 - r2);
            int dc = Math.abs(c1 - c2);

            if (!((dr == 2 && dc == 1) || (dr == 1 && dc == 2))) {
                return false;
            }
        }

        return true;
    }
}