package BordGamer;

public class Piece {
    protected Position position;
    private Board bord;

    public Piece(Board bord) {
        this.bord = bord;
        position = null;
      
    }

  protected Board getBord() {    // somente seja acessado pelo tabuleuiro e as subclasses das peças 
        return bord;
    }

    
}
    

