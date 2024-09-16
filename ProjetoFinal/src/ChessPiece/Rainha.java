package ChessPiece;

import BordGamer.Board;
import chess.ChessPiece;
import chess.Color;

public class Rainha extends ChessPiece {

  public Rainha(Board board, Color color){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "Q " : "q ";
  }
    
} 
