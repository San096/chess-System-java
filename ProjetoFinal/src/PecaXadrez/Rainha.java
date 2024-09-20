package PecaXadrez;

import BordaGame.Borda;
import Xadrez.ChessPiece;
import Xadrez.Color;

public class Rainha extends ChessPiece {

  public Rainha(Borda board, Color color){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "Q " : "q ";
  }
    
} 
