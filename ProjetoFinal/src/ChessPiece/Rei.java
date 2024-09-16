package ChessPiece;

import BordGamer.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Rei extends ChessPiece {

  public Rei(Board board, Color color, ChessMatch chessMatch){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "R " : "r ";
  }

  @Override
  public boolean[][] possibleMoves() {
    boolean [][] Mat = new boolean[getBord().getRows()][getBord().getCollumns()];
    return null;
    
  }
    
}
