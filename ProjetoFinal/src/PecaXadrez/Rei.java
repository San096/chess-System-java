package PecaXadrez;

import BordaGame.Borda;
import Xadrez.ChessMatch;
import Xadrez.ChessPiece;
import Xadrez.Color;

public class Rei extends ChessPiece {

  public Rei(Borda board, Color color, ChessMatch chessMatch){
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
