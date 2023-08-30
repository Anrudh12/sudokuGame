package sudoku;
/**
 * Define the named constants used in many classes.
 */
public class SudokuConstants {
   /** Size of the board */
   public static final int GRID_SIZE = 9;
   /** Size of sub-grid of the board */
   public static final int SUBGRID_SIZE = 3;
}
public enum CellStatus {
   GIVEN,         // clue, no need to guess
   TO_GUESS,      // need to guess - not attempted yet
   CORRECT_GUESS, // need to guess - correct guess
   WRONG_GUESS    // need to guess - wrong guess
      // The puzzle is solved if none of the cells have 
      //  status of TO_GUESS or WRONG_GUESS
}
