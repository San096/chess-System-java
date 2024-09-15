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
    return "R ";
  }
    
}
