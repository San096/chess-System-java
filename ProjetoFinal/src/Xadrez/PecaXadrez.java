
package Xadrez;
import BordaGame.Borda;
import BordaGame.Peca;
import BordaGame.Posicao;

public abstract class PecaXadrez extends Peca { // perça de xadrez herda os atirbutos de perças 

    protected Color color;

    public PecaXadrez(Borda board , Color color){ // super construtor da borda do xadrez 
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Posicao position){
        PecaXadrez p =  (PecaXadrez)getBord().piece(position);
        return p != null && getColor() != color;
    }
    

    

   
    
    
}
