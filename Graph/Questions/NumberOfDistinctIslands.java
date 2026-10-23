public class NumberOfDistinctIslands {
    
    // TC -> O(n * m)
    // SC -> O(n * m)
    private void dfs(int row, int col, int[][] vis, int[][] grid, ArrayList<String> shape, int baseRow, int baseCol) {
        vis[row][col] = 1;
        shape.add((row - baseRow) + "," + (col - baseCol));
        int n = grid.length;
        int m = grid[0].length;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        for(int i=0; i<4; i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
            && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, vis, grid, shape, baseRow , baseCol);
            }
        }
    }
    public int countDistinctIslands(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int[][] vis = new int[n][m];
      HashSet<String> set = new HashSet<>();
      for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            if(vis[i][j] == 0 && grid[i][j] == 1) {
                ArrayList<String> shape = new ArrayList<>();
                dfs(i, j, vis, grid, shape, i , j);
                set.add(shape.toString());
            }
        }
      }
      return set.size();
    }

    public static void main(String[] args) {
        
    }
}
