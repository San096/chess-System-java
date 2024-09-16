package chess;
import BordGamer.Board;
import BordGamer.Piece;
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

    public ChessPiece performChessMove(ChessPosition source , ChessPosition target){
        validateSourcePosition(source.toPosition());
        Piece capturedPiece = makeMove(source,target);
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(ChessPosition source, ChessPosition target){
        Piece P = board.removePiece(source.toPosition());
        Piece capturedPiece = board.removePiece(target.toPosition());
        board.placePiece(P, target.toPosition());
        return capturedPiece;

    }

    private void validateSourcePosition(Position position) {
        if(!board.thereIsAPiece(position)){
            throw new ChessExeption("Não existe peça nessa posição ");
        }
        if(!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessExeption("Não é possivel mexer a peça  ");

        }

    }

    private void placeNewPiece(char columns ,int row, ChessPiece piece){ // metodo para criar uma nova peça 
        board.placePiece(piece, new ChessPosition(columns , row).toPosition());
    }

    private void initialSetup(){// metodo pra colocar uma peça no tabuleiro 
        placeNewPiece('a', 1, new Torre(board, Color.WHITE));
        placeNewPiece('b', 1, new Cavalo(board, Color.WHITE));
        placeNewPiece('c', 1, new Bispo(board, Color.WHITE));
        placeNewPiece('d', 1, new Rainha(board, Color.WHITE));
        placeNewPiece('e', 1, new Rei(board, Color.WHITE, this));
        placeNewPiece('f', 1, new Bispo(board, Color.WHITE));
        placeNewPiece('g', 1, new Cavalo(board, Color.WHITE));
        placeNewPiece('h', 1, new Torre(board, Color.WHITE));
        placeNewPiece('a', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('b', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('c', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('d', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('e', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('f', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('g', 2, new Piao(board, Color.WHITE, this));
        placeNewPiece('h', 2, new Piao(board, Color.WHITE, this));

        placeNewPiece('a', 8, new Torre(board, Color.BLACK));
        placeNewPiece('b', 8, new Cavalo(board, Color.BLACK));
        placeNewPiece('c', 8, new Bispo(board, Color.BLACK));
        placeNewPiece('d', 8, new Rainha(board, Color.BLACK));
        placeNewPiece('e', 8, new Rei(board, Color.BLACK, this));
        placeNewPiece('f', 8, new Bispo(board, Color.BLACK));
        placeNewPiece('g', 8, new Cavalo(board, Color.BLACK));
        placeNewPiece('h', 8, new Torre(board, Color.BLACK));
        placeNewPiece('a', 7, new Piao(board, Color.BLACK,this));
        placeNewPiece('b', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('c', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('d', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('e', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('f', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('g', 7, new Piao(board, Color.BLACK, this));
        placeNewPiece('h', 7, new Piao(board, Color.BLACK, this));
	}
        
    }

