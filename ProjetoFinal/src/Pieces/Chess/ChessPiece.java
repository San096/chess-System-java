package Pieces.Chess;

import enums.Color;
import Pieces.Piece;

/** 
 * Classe abstrata onde serão estipuladas algumas regras para uma peça de xadrez
 */
public abstract class ChessPiece extends Piece {
  protected boolean firstMove = true;

  public ChessPiece(Color color) {
    super(color);
  }

  public boolean isFirstMove() {
    return firstMove;
  }

  public void takeFirstMove() {
    this.firstMove = false;
  }
}