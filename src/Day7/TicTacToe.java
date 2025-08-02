package Day7;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        // Initialize board to '-'
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                board[i][j] = '-';
            }
        }

        // Print initial board
        printBoard(board);

        // Ask for row and column input (0-based)
        System.out.print("Enter your row (0, 1 or 2): ");
        int row = scanner.nextInt();

        System.out.print("Enter your col (0, 1 or 2): ");
        int col = scanner.nextInt();

        // Validate input (simple version)
        if(row >= 0 && row < 3 && col >= 0 && col < 3) {
            if(board[row][col] == '-') {
                board[row][col] = 'X';  // Place X on the board
            } else {
                System.out.println("Cell is already occupied!");
            }
        } else {
            System.out.println("Invalid row or column!");
        }

        // Print the updated board
        printBoard(board);

        scanner.close();
    }

    // Helper method to print the board
    public static void printBoard(char[][] board) {
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
