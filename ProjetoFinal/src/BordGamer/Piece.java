package BordGamer;

public class Piece {
    protected Position position;
    protected Board bord;

    public Piece(Board bord) {
        this.bord = bord;
        position = null;  // posição se iniciara nula 
      
    }

  protected Board getBord() {    // somente seja acessado pelo tabuleuiro e as subclasses das peças 
        return bord;
    }

    
}
    

