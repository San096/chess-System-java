package PecaXadrez;

import BordaGame.Borda;
import Xadrez.PecaXadrez;
import Xadrez.Color;

public class Bispo extends PecaXadrez {

  public Bispo(Borda board, Color color){
    super(board, color);
  }

  @Override

  public String toString(){
    return this.getColor().equals(Color.WHITE) ? "B " : "b ";
  }
    
}