package Backtracking;

public class ShudokuSolver {
    
    public static void main(String[] args) {
        
    }


    // TC -> O(9pow(no of choice))
    // SC -> O(1)
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0) ;
    }

    static boolean isSafe(char[][] board, int row, int col, char dig) {
        //horizontal && vertical -> 
        for(int j=0; j<9; j++) {
           if(board[row][j] == dig) {
            return false ;
           }
           if(board[j][col] == dig) {
            return false ;
           }
        }

        // grid ->
        int sRow = (row/3) * 3 ;
        int sCol = (col/3) * 3 ;
        for(int i=sRow; i<=sRow+2; i++) {
            for(int j=sCol; j<=sCol+2; j++) {
                if(board[i][j] == dig) {
                    return false ;
                }
            }
        }
        return true ;
    }

    static boolean helper(char[][] board, int row, int col) {
        if(row == 9) {
            return true ;
        }
        
         int nextRow = row, nextCol = col + 1 ;
         if(nextCol == 9) {
            nextRow = row + 1 ;
            nextCol = 0 ;
         }

        if(board[row][col] != '.') {
            return helper(board, nextRow, nextCol) ;
        }

        //place the digit 
        for(char dig='1'; dig<='9'; dig++) {
           if(isSafe(board, row, col, dig)) {
              board[row][col] = dig ;
              if(helper(board, nextRow, nextCol)) {
              return true ;
            }
            board[row][col] = '.' ;
           }
        }
        return false ;
    }
    
}
