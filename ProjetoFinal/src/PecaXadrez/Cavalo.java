package PecaXadrez;

import BordaGame.Borda;
import Xadrez.ChessPiece;
import Xadrez.Color;

public class Cavalo extends ChessPiece {

  public Cavalo(Borda board, Color color){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "C " : "c ";
  }
    
} 
    
    

