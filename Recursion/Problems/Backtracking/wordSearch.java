package Backtracking;

public class wordSearch {
    
     // TC -> O(m * n * 4pow(word.length))
    // SC -> O(word.length)
    static boolean helper(char[][] board, int r, int c, String word, int idx) {
        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || (board[r][c] != word.charAt(idx))) {
            return false; 
        }

        if(idx == word.length() - 1) {
            return true ;
        }

        char temp = board[r][c] ;
        board[r][c] = '#';

        boolean found = 
            helper(board, r - 1, c, word, idx + 1) || // up
            helper(board, r + 1, c, word, idx + 1) ||// down
            helper(board, r, c + 1, word, idx + 1) ||// right
            helper(board, r, c - 1, word, idx + 1); // left
        
        board[r][c] = temp ;

        return found ;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length ;
        int n = board[0].length ;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(helper(board, i, j, word, 0)) {
                    return true ;
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        
    }
}
