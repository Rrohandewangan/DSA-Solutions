package Backtracking;

import java.util.ArrayList;

public class RatInMaze {


    // TC -> O(4pow(n2))
    // SC -> O(1)
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> result = findPath(maze) ;
        for(String s : result) {
            System.out.println(s);
        }
    }

    static ArrayList<String> findPath(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>() ;
        String path = "" ;
        

        helper(maze, 0, 0, path, ans);
        return ans;
    }

    static void helper(int[][] maze, int r, int c, String path, ArrayList<String> ans) {
        int n = maze.length ;
        if(r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1){
            return ;
        }

        if(r == n - 1 && c == n - 1) {
            ans.add(path) ;
            return ;
        }

        maze[r][c] = -1 ;

        helper(maze, r + 1, c, path + "D", ans); // down
        helper(maze, r - 1, c, path + "U", ans); // up
        helper(maze, r , c - 1, path + "L", ans); // left
        helper(maze, r , c + 1, path + "R", ans); // right

        maze[r][c] = 1 ;
    }
}