
package chess;
import BordGamer.Board;
import BordGamer.Piece;

public class ChessPiece extends Piece { // perça de xadrez herda os atirbutos de perças 

    private Color color;

    public ChessPiece(Board board , Color color){ // super contrutor bo
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
    
}
