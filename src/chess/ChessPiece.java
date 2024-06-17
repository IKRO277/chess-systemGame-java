package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public class ChessPiece extends Piece{
	
	private Color color;
	
	public ChessPiece(Position position, Board board, Color color) {
		super(position, board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
