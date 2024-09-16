package BordGamer;

public abstract class Piece {
    protected Position position;
    protected Board bord;

    public Piece(Board bord) {
        this.bord = bord;
        position = null;  // posição se iniciara nula 
      
    }

  protected Board getBord() {    // somente seja acessado pelo tabuleuiro e as subclasses das peças 
        return bord;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0 ; i < mat.length; i++){
            for(int j=0; j<mat.length;j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    
}
    

