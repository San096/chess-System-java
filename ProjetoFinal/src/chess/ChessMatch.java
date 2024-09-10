package chess;
import BordGamer.Board;
import BordGamer.Position;
import ChessPiece.Bispo;
import ChessPiece.Cavalo;
import ChessPiece.Piao;
import ChessPiece.Rainha;
import ChessPiece.Rei;
import ChessPiece.Torre;


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

    private void placeNewPiece(char columns ,int row, ChessPiece piece){ // metodo para criar uma nova peça 
        board.placePiece(piece, new ChessPiece(columns , row).toPosition());
    }

    private void initialSetup(){// metodo pra colocar uma peça no tabuleiro , iniciando uma partida 
        placeNewPiece('a' , 6 ,new Torre(board , Color.WHITE));
        
    }

}