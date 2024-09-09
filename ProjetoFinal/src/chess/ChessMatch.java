package chess;
import BordGamer.Board;

public class ChessMatch{ // partida de xadrez

    private Board board;

    public ChessMatch() {
      board = new Board(8,8); // dimensões de um tabuleiro de xadrez 
    }


    public ChessPiece [][] getPieces(){ //retorna um matriz de perças correspondente a partida ,
     ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCollumns()];
      
     for (int i= 0 ;i <board.getRows();i++){
        for(int j = 0 ;j <board.getCollumns();j++){
            mat[i][j] = (ChessPiece) board.piece(i,j); //foi feito o dawquesting para matrix retorna um peça de xadrex e não uma peça comum 

        }
     }
        return mat;
    }

}