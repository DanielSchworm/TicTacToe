# TicTacToe Assignment ![bild](Icons/javaicon.png)
### Instructions
In this assignment the game Tic-Tac-Toe shall be realized. The game is played on a 3×3 square grid by two players. The two players alternately place their characters (e.g. "X" and "O") in a free space. The first player to place three characters in a row, column or diagonal wins. More background information and rules for this game can be found on [Wikipedia](https://de.wikipedia.org/wiki/Tic-Tac-Toe).

### Specifications
The project had to be carried out under certain conditions.
It had to be written in the Java programming language. The given classes and functional structures had to be completely retained. No further classes and methods were allowed to be added.

[Click to open the Specifications](AssignemtTicTacToe.pdf)

```Java
public class TicTacToe {

  private int ROWS = 3;
  private int COLS = 3;
  public Player[][] board;
  
  public enum Player {
    Unknown, X, O
  }
  private Player currentPlayer;
  private Player winner;
  public TicTacToe() {}
  public void initialiazeBoard() {}
  public void play(int row, int col) {}
  public boolean isBoardEmpty() {}
  public boolean isGameWon() {}
  public boolean isDraw() {}
  public boolean isGameOver() {}
  public Player getCurrentPlayer() {}
  public Player getWinner() {}

}
```
