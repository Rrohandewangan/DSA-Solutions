package Problems.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    
    // TC -> O(n! * n)
    // SC -> o(k * n2) here k = no of possible solutions
    static boolean isSafe(char[][] board, int row, int col, int n) { // o(n)

        //horizontal
        for(int j=0; j<n; j++) {
            if(board[row][j] == 'Q') {
                return false ;
            } 
        }
        // vertical
        for(int i=0; i<n; i++) {
            if(board[i][col] == 'Q') {
                return false ;
            } 
        }
        // left diagonal 
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false ;
            }
        }
        // right diagonal 
        for(int i=row, j=col; i>=0 && j<n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false ;
            }
        }
        return true ;
    }
    
    static void saveBoards(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>() ;

        for(int i=0; i<board.length; i++) {
            StringBuilder row = new StringBuilder() ;
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q') {
                    row.append('Q');
                } else {
                    row.append('.') ;
                }
            }
            newBoard.add(row.toString()) ;
        }
        allBoards.add(newBoard) ;
    }

    static void nQueens(char[][] board, int row, int n, List<List<String>> allBoards) {
        if(row == n) {
        saveBoards(board, allBoards);
            return ;
        }

        for(int j=0; j<n; j++) {
            if(isSafe(board, row, j, n)) {
                board[row][j] = 'Q' ;
                nQueens(board, row+1, n, allBoards) ;
                board[row][j] = '.' ;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>() ;
        char[][] board = new char[n][n] ;

        nQueens(board, 0, n, allBoards) ;
        return allBoards ;

    }
    public static void main(String[] args) {
        
    }
}
