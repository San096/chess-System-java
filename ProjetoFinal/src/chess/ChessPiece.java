
package chess;
import BordGamer.Board;
import BordGamer.Piece;
import BordGamer.Position;

public abstract class ChessPiece extends Piece { // perça de xadrez herda os atirbutos de perças 

    private Color color;

    public ChessPiece(Board board , Color color){ // super construtor da borda do xadrez 
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p =  (ChessPiece)getBord().piece(position);
        return p != null && getColor() != color;
    }
    

    

   
    
    
}
