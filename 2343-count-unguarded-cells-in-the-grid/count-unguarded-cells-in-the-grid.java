class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int sol[][] = new int[m][n];
        
        // Mark walls
        for (int i = 0; i < walls.length; i++) {
            sol[walls[i][0]][walls[i][1]] = 1;
        }

        // Mark guards
        for (int i = 0; i < guards.length; i++) {
            sol[guards[i][0]][guards[i][1]] = 2;
        }

        // Directions: up, down, left, right
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        
        // Mark guarded cells
        for (int i = 0; i < guards.length; i++) {
            int gx = guards[i][0];
            int gy = guards[i][1];

            for (int[] d : dir) {
                int x = gx + d[0];
                int y = gy + d[1];
                while (x >= 0 && x < m && y >= 0 && y < n && sol[x][y] != 1 && sol[x][y] != 2) {
                    sol[x][y] = 3;  // mark guarded
                    x += d[0];
                    y += d[1];
                }
            }
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sol[i][j] == 0) count++;
            }
        }

        return count;
    }
}
