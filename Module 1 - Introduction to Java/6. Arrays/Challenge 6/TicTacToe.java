import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");

    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };
    // Task 2: Call the function printBoard();
    printBoard(board);
    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     * 
     * Task 6 - Call the function.
     * if return value == 3 {
     * print: X wins and break the loop
     * } else if return value == -3 {
     * print: O wins and break the loop
     * }
     * 
     * }
     */

    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        System.out.println("Turn: X");
        askUser(board, 'X');
      } else {
        System.out.println("Turn: 0");
        askUser(board, '0');
      }
      printBoard(board);
    }
    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */

  public static void printBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.print("\n\n");
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */

  public static int[] askUser(char[][] board, char player) {
    System.out.println("- pick a row and column number:");
    int row = scan.nextInt();
    int col = scan.nextInt();
    while (true) {
      if (row > 2 || col > 2) {
        System.out.println("- Out of bounds, pick a row and column between 0 and 2");
        row = scan.nextInt();
        col = scan.nextInt();
      } else if (board[row][col] != '_') {
        System.out.println("- Spot taken, pick another row and column number:");
        row = scan.nextInt();
        col = scan.nextInt();
      }

      else {
        break;
      }
    }
    int[] result = { row, col };
    board[row][col] = player;
    return result;
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */

  // public static int checkWin(char[][] board) {
  // // check rows
  // for (int i = 0; i < board.length; i++) {
  // int count = 0;
  // for (int j = 0; j < board[i].length; j++) {
  // if (board[i][j] == board[i][0]) {
  // count++;
  // }
  // if(count == 3)
  // }

  // }
  // check columns

  // check left diagonal
  // check right diagonal

  // }

}
