package chess;
import BordGamer.Board;
import BordGamer.Position;
import ChessPiece.Bispo;
import ChessPiece.Cavalo;
import ChessPiece.Rainha;
import ChessPiece.Rei;
import ChessPiece.Torre;
import ChessPiece.Piao;

public class ChessMatch{ // partida de xadrez

    private Board board;

    public ChessMatch() {
      board = new Board(8,8); // dimensões de um tabuleiro de xadrez 
      initialSetup();
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

    private void initialSetup(){// metodo pra colocar uma peça no tabuleiro , iniciando uma partida 
        board.placePiece(new Torre(board , Color.WHITE) , new Position (0, 0));
        board.placePiece(new Cavalo(board , Color.WHITE) , new Position (0, 1));
        board.placePiece(new Bispo(board , Color.WHITE) , new Position (0, 2));
        board.placePiece(new Rainha(board , Color.WHITE) , new Position (0, 3));
        board.placePiece(new Rei(board , Color.WHITE), new Position (0 , 4));
        board.placePiece(new Bispo(board , Color.WHITE), new Position (0 , 5));
        board.placePiece(new Cavalo(board , Color.WHITE), new Position (0 , 6));
        board.placePiece(new Torre(board , Color.WHITE), new Position (0 , 7));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 0));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 1));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 2));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 3));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 4));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 5));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 6));
        board.placePiece(new Piao(board , Color.WHITE), new Position (1, 7));
        
    }

}