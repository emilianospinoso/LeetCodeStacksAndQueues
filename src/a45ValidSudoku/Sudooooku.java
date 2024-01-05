package a45ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Sudooooku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.'}
                        , {'6', '4', '2'}
                        , {'.', '7', '9'}};
        System.out.println(isValidSudoku(board));

    }

    static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> rows = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                boolean result = rows.add(board[i][j]);
                System.out.println(board[i][j]);
                if (!result) {
                    System.out.println("Error:Duplicate in row");
                    return false;
                }
            }
        }
        for (int j = 0; j < board.length; j++) {
            Set<Character> columns = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                boolean result = columns.add(board[i][j]);
                if (!result) {
                    System.out.println("Error:Duplicate in column");
                    return false;
                }
            }
        }
        return true;
    }
}
