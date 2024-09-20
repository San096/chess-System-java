package PecaXadrez;

import BordaGame.Borda;
import Xadrez.ChessMatch;
import Xadrez.ChessPiece;
import Xadrez.Color;

public class Piao extends ChessPiece {

  public Piao(Borda board, Color color, ChessMatch chessMatch){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "P " : "p ";
  }
    
} 