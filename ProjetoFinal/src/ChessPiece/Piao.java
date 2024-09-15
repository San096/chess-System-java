package ChessPiece;

import BordGamer.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Piao extends ChessPiece {

  public Piao(Board board, Color color, ChessMatch chessMatch){
    super(board, color);
  }

  @Override

  public String toString(){
    return "P ";
  }
    
} 