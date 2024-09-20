package BordaGame;

public abstract class Peca {
    protected Posicao position;
    protected Borda bord;

    public Peca(Borda bord) {
        this.bord = bord;
        position = null;  // posição se iniciara nula 
      
    }

  protected Borda getBord() {    // somente seja acessado pelo tabuleuiro e as subclasses das peças 
        return bord;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Posicao position){
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
    

