package ChessPiece;

import BordGamer.Board;
import chess.ChessPiece;
import chess.Color;

public class Bispo extends ChessPiece {

  public Bispo(Board board, Color color){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "B " : "b ";
  }
    
}