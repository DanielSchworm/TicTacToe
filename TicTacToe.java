// Produced by Daniel Schworm, Jimmy Jablonski and Peter Falterbaum.
// © December 2019

public class TicTacToe {

	private final int ROWS = 3;
	private final int COLS = 3;

	public enum Player {
		Unknown, X, O
	}

	public Player[][] board;
	private Player currentPlayer;
	private Player winner;

	public TicTacToe() {
		initialiazeBoard();
		currentPlayer = Player.X;
		winner = null;
	}

	public void play(int row, int col) {
		try {
                if (this.board[row][col] == Player.Unknown) {
                        this.board[row][col] = this.getCurrentPlayer();
                }
                else{
                        throw new RuntimeException();
                }
        }
        catch (Exception e) {
                throw new RuntimeException("Number of Column / Row is out of Range or Game is already finished.");
        }
				if(this.isGameWon()==true){
					winner = this.getCurrentPlayer();
					return;
				}

        if (this.getCurrentPlayer() == Player.O) {
                this.currentPlayer = Player.X;
        }
        else if (this.getCurrentPlayer() == Player.X) {
                this.currentPlayer = Player.O;
        }
	}

	public void initialiazeBoard() {
		board = new Player[ROWS][COLS];
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
				board[r][c] = Player.Unknown;
			}
		}
	}

	public boolean isBoardEmpty(){
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
				if(board[r][c]!=Player.Unknown) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isGameWon() {
		boolean won = false;
		for (int a = 0; a < this.board.length; a++)
						if (board[a][0]!=Player.Unknown && this.board[a][0] == this.board[a][1] && this.board[a][0] == this.board[a][2]) {
										won = true;
										this.winner = this.board[a][0];
						}
		for (int a = 0; a < this.board[0].length; a++)
						if (board[0][a]!=Player.Unknown && this.board[0][a] == this.board[1][a] && this.board[0][a] == this.board[2][a]) {
										won = true;
										this.winner = this.board[0][a];
						}
		if (board[0][0]!=Player.Unknown && this.board[0][0] == this.board[1][1] && this.board[0][0] == this.board[2][2]) {
						won = true;
						this.winner = this.board[0][0];
		}
		if (board[0][2]!=Player.Unknown && this.board[0][2] == this.board[1][1] && this.board[0][2] == this.board[2][0]) {
						won = true;
						this.winner = this.board[0][2];
		}
		return won;
	}

	public boolean isDraw() {
		if(this.isGameWon()==true){
			return false;
		}
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
				if(board[r][c]==Player.Unknown){
					return false;
				}
			}
		}
		return true;
	}

	public boolean isGameOver() {
		if(this.isGameWon()==true || this.isDraw()==true){
			return true;
		}
		return false;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getWinner() {
		return this.winner;
	}
}