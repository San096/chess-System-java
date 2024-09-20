package Xadrez;
import BordaGame.Borda;
import BordaGame.Peca;
import BordaGame.Posicao;
import PecaXadrez.Bispo;
import PecaXadrez.Cavalo;
import PecaXadrez.Piao;
import PecaXadrez.Rainha;
import PecaXadrez.Rei;
import PecaXadrez.Torre;

public class ChessMatch{ // partida de xadrez

    private Borda board;

    public ChessMatch() {
      board = new Borda(8,8); // dimensões de um tabuleiro de xadrez 
      iniciarSetap();
    }


    public PecaXadrez [][] getPieces(){ //retorna um matriz de perças correspondente a partida ,
     PecaXadrez[][] mat = new PecaXadrez[board.getRows()][board.getCollumns()];
      
     for (int i= 0 ;i <board.getRows();i++){
        for(int j = 0 ;j <board.getCollumns();j++){
            mat[i][j] = (PecaXadrez) board.piece(i,j); //foi feito o dawquesting para matrix retorna um peça de xadrex e não uma peça comum 

        }
     }
        return mat;
    }

    public PecaXadrez performChessMove(ChessPosition source , ChessPosition target){
        validateSourcePosition(source.toPosition());
        Peca capturedPiece = makeMove(source,target);
        return (PecaXadrez) capturedPiece;
    }

    private Peca makeMove(ChessPosition source, ChessPosition target){
        Peca P = board.removePiece(source.toPosition());
        Peca capturedPiece = board.removePiece(target.toPosition());
        board.placePiece(P, target.toPosition());
        return capturedPiece;

    }

    private void validateSourcePosition(Posicao position) {
        if(!board.thereIsAPiece(position)){
            throw new ChessExeption("Não existe peça nessa posição ");
        }
        if(!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessExeption("Não é possivel mexer a peça  ");

        }

    }

    private void ColocarNovaPeca(char columns ,int row, PecaXadrez piece){ // metodo para criar uma nova peça 
        board.placePiece(piece, new ChessPosition(columns , row).toPosition());
    }

    private void iniciarSetap(){// metodo pra colocar uma peça no tabuleiro 
        ColocarNovaPeca('a', 1, new Torre(board, Color.WHITE));
        
	}
        
    }

