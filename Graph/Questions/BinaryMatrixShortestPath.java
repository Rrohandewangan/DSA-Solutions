public class BinaryMatrixShortestPath {

    // for 4 direction and src and dest is given GFG version -> 
    // TC -> O(N * M)
    // SC -> O(N * M)
class tuple {
    int first, second, third;
    tuple(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution {
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        if(source[0] == destination[0] && 
           source[1] == destination[1]) return 0;
        Queue<tuple> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] dist = new int[n][m];
        for(int i=0; i<n; i++) {
            Arrays.fill(dist[i], (int) 1e9);
        }

        dist[source[0]][source[1]] = 0;
        q.add(new tuple(0, source[0], source[1]));
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()) {
            tuple it = q.poll();
            int dis = it.first;
            int r = it.second;
            int c = it.third;

            for(int i=0; i<4; i++) {
                int nrow = r + dr[i];
                int ncol = c + dc[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                   && grid[nrow][ncol] == 1
                   && dis + 1 < dist[nrow][ncol]) {
                    dist[nrow][ncol] = 1 + dis;
                    if(nrow == destination[0] &&
                       ncol == destination[1]) return dis + 1;
                       q.add(new tuple(1+dis, nrow, ncol));
                }
            }
        }
        return -1;
    }
}


/// leetCode Version
    // TC: O(N × M)
    // SC: O(N × M)
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) {
            return -1;
        }

        if (n == 1 && m == 1) {
            return 1;
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][m];

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        vis[0][0] = true;
        q.add(new int[]{1, 0, 0});

        while (!q.isEmpty()) {

            int[] it = q.poll();

            int dis = it[0];
            int r = it[1];
            int c = it[2];

            for (int i = 0; i < 8; i++) {

                int nrow = r + dr[i];
                int ncol = c + dc[i];

                if (nrow >= 0 && nrow < n &&
                    ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == 0 &&
                    !vis[nrow][ncol]) {

                    if (nrow == n - 1 && ncol == m - 1) {
                        return dis + 1;
                    }

                    vis[nrow][ncol] = true;
                    q.add(new int[]{dis + 1, nrow, ncol});
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
    }
}
