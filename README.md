# sudokuGame
For better OO and modular design, we design SIX classes (in a package called sudoku) as shown in the above class diagram:

1)SudokuConstants: To store the named constants such as GRID_SIZE - to be referred to as SudokuConstants.GRID_SIZE.

2)Cell: We customize the JTextField, by creating a subclass called Cell, with additional variables row, col, number and status, to model each cell of the grid. The Cell has its own methods to paint() itself.

3)CellStatus: An enumeration (enum) called CellStatus is designed to hold the status constants, including GIVEN, CORRECT_GUESS, WRONG_GUESS and TO_GUESS.

4)GameBoardPanel: We also customize the JPanel, by creating a subclass called GameBoardPanel, to hold the grid of 9x9 Cells (JTextFields). Similar to Cell, the GameBoardPanel has its own methods to paint() itself.

5)SudokuMain: We further customize the JFrame, by creating a subclass called SudokuMain, to hold the GameBoardPanel (JPanel) in its ContentPane.

6)Puzzle: A class called Puzzle is designed to model the number puzzle, which holds the numbers and clues in 9x9 int array numbers and boolean array isGiven. The method 
newPuzzle() can be used to generate a new puzzle for a new game.

Package sudoku
All the classes are kept in a package called sudoku.

In Eclipse/NetNeans/VSCode, first create a "Java Project" called "sudoku"; then create a new package (new ⇒ package) also called sudoku. You can then create the classes under the sudoku package.
If you are using JDK/TextEditor, create a sub-directory called sudoku and place the classes under the sub-directory.

#solver
Uses Backtracking Algorithm for getting answers automatically 
