package PecaXadrez;


import BordaGame.Borda;
import BordaGame.Posicao;
import Xadrez.PecaXadrez;
import Xadrez.Color;

public class Torre extends PecaXadrez {

    public Torre(Borda board, Color color) {
        super(board, color);
        
    }


    @Override

    public String toString(){
        return this.getColor().equals(Color.WHITE) ? "T " : "t ";
    }
    //acima
    @Override
    public boolean[][] movimentosPossiveis() {
        boolean [][] Mat = new boolean[getBord().getRows()][getBord().getCollumns()];

        Posicao p = new Posicao();

        p.setValues(position.getRow()-1 , position.getColumn());
        while (getBord().positionExists(p) && !getBord().thereIsAPiece(p)) {
            Mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
        }
        if(getBord().positionExists(p) && isThereOpponentPiece(p)){
            Mat[p.getRow()][p.getColumn()] = true;
        }
        //esquerda

        p.setValues(position.getRow()-1 , position.getColumn()-1);
        while (getBord().positionExists(p) && !getBord().thereIsAPiece(p)) {
            Mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBord().positionExists(p) && isThereOpponentPiece(p)){
            Mat[p.getRow()][p.getColumn()] = true;
        }

        //direita
        p.setValues(position.getRow()-1 , position.getColumn()+1);
        while (getBord().positionExists(p) && !getBord().thereIsAPiece(p)) {
            Mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()+1);
        }
        if(getBord().positionExists(p) && isThereOpponentPiece(p)){
            Mat[p.getRow()][p.getColumn()] = true;
        }
        

        //PraBaixo

        p.setValues(position.getRow()+1 , position.getColumn());
        while (getBord().positionExists(p) && !getBord().thereIsAPiece(p)) {
            Mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);
        }
        if(getBord().positionExists(p) && isThereOpponentPiece(p)){
            Mat[p.getRow()][p.getColumn()] = true;
        }




        return Mat;
    }


    @Override
    public boolean[][] movimentosPossiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'possibleMoves'");

  

    
    }
    
}
