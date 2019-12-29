public class TicTacToe {

	private int ROWS = 3;
	private int COLS = 3;

	public enum Player {
		Unknown,  	//empty (no player yet)
		X,  		//player X
		O   		//player O
	}

	public Player[][] board;
	private Player currentPlayer;
	private Player winner;

	// Konstruktor
	// zweidimensionales Array
	// - Jedes Feld des Arrays erhält als Inhalt des Enum-Wert Player
	// Spieler X fängt an
	// winner = 0
	public TicTacToe() {
	}
	public void initialiazeBoard() {}

	public boolean isGameWon() {

	}

	public boolean isDraw() {
	}

	public Player getWinner() {

	}

	public boolean isGameOver() {
	}

	public void play(int row, int col) {
	}

	public Player getCurrentPlayer() {

	}
}