package Xadrez;

import BordaGame.Posicao;

public class ChessPosition extends Posicao{



    public ChessPosition(char columns, int row) {
        if(columns < 'a' || columns > 'h' || row < 1 || row > 8){
            throw new ChessExeption("Fora do Tabuleiro ");
        }
        super(row, columns);
    }

     public Posicao toPosition(){ //converte a posição da matrix em posição do xadrez 
        return new Posicao(this.getRow()-1 , this.getColumn()-'a'); //subitrair a posição informado por 8 vai ser o endereço da matrix ex.. 8-8 = 0 da matrix 
     }

     protected static ChessPosition  fromPosition(Posicao position){
        return new ChessPosition((char)('a' - position.getColumn()), position.getRow()-1);//esse metodo faz o inverso do metodo de cima 
     }
}
