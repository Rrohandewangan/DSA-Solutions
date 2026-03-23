package Problems.Backtracking;
import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    
    // TC -> O(n! * n)
    // SC -> o(k * n2) here k = no of possible solutions
    // static boolean isSafe(char[][] board, int row, int col, int n) { // o(n)

    //     //horizontal
    //     for(int j=0; j<n; j++) {
    //         if(board[row][j] == 'Q') {
    //             return false ;
    //         } 
    //     }
    //     // vertical
    //     for(int i=0; i<n; i++) {
    //         if(board[i][col] == 'Q') {
    //             return false ;
    //         } 
    //     }
    //     // left diagonal 
    //     for(int i=row, j=col; i>=0 && j>=0; i--, j--) {
    //         if(board[i][j] == 'Q') {
    //             return false ;
    //         }
    //     }
    //     // right diagonal 
    //     for(int i=row, j=col; i>=0 && j<n; i--, j++) {
    //         if(board[i][j] == 'Q') {
    //             return false ;
    //         }
    //     }
    //     return true ;
    // }
    
    // static void saveBoards(char[][] board, List<List<String>> allBoards) {
    //     List<String> newBoard = new ArrayList<>() ;

    //     for(int i=0; i<board.length; i++) {
    //         StringBuilder row = new StringBuilder() ;
    //         for(int j=0; j<board[0].length; j++) {
    //             if(board[i][j] == 'Q') {
    //                 row.append('Q');
    //             } else {
    //                 row.append('.') ;
    //             }
    //         }
    //         newBoard.add(row.toString()) ;
    //     }
    //     allBoards.add(newBoard) ;
    // }

    // static void nQueens(char[][] board, int row, int n, List<List<String>> allBoards) {
    //     if(row == n) {
    //     saveBoards(board, allBoards);
    //         return ;
    //     }

    //     for(int j=0; j<n; j++) {
    //         if(isSafe(board, row, j, n)) {
    //             board[row][j] = 'Q' ;
    //             nQueens(board, row+1, n, allBoards) ;
    //             board[row][j] = '.' ;
    //         }
    //     }
    // }

    // public List<List<String>> solveNQueens(int n) {
    //     List<List<String>> allBoards = new ArrayList<>() ;
    //     char[][] board = new char[n][n] ;

    //     nQueens(board, 0, n, allBoards) ;
    //     return allBoards ;

    // }




    // 2nd approach -> 
    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board) ;
            System.out.println();
            return 1 ;
        }

        int count = 0;
        
        // placing the queen and checking for every row and col
        for(int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true ;
                count += queens(board, row + 1) ;
                board[row][col] = false ;
            }
        }

        return count ;
    }


    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row 
        for(int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false ;
            }
        }

        // digonal left -> 
        int maxLeft = Math.min(row, col) ;
        for(int i=0; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false ;
            }
        }

        // digonal right -> 
        int maxRight = Math.min(row, board.length - col - 1) ;
        for(int i=1; i<=maxRight; i++) {
            if(board[row-i][col+i]) {
                return false ;
            }
        }

        return true ;
    }


    private static void display(boolean[][] board) {
        for(boolean [] row : board) {
            for(boolean element : row) {
                if(element) {
                    System.out.print('Q'+ " ");
                } else {
                    System.out.print('.'+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4 ;
        boolean[][] board = new boolean[n][n] ;
        System.out.println(queens(board, 0)) ;

    }
}
