package BordaGame;

import Xadrez.PecaXadrez;

public class Borda {
    private int rows;
    private int collumns;
    private Peca[] [] pieces;

    public Borda(int rows, int collumns) {
        if (rows < 1 || collumns < 1) {
            throw new BoardExcepition("Erro ao criar tabuleiro  e necessario ter pelomenos 1 linha e 1 coluna"); 
        }
        this.rows = rows;
        this.collumns = collumns;
        pieces = new Peca[rows][collumns]; // a matriz iniciara com a quantidades de linha e colunas informadas 
    }
    public int getRows() {
        return rows;
    }
    public int getCollumns() {
        return collumns;
    }
   

    public Peca piece(int row ,int column){
        if(!positionExists(row ,column)){
            throw new BoardExcepition("fora do tabuleiro  ");
        }
        return pieces[row] [column];
    }
     public Peca piece(Posicao position){ // sobreposição do metodo piece
        if(!positionExists(position)){
            throw new BoardExcepition("Posição fora do tabuleiro  ");
        }
         return pieces[position.getRow()] [position.getColumn()];
     }

// metodo colocar peça no tabuleiro
     public void  placePiece(Peca piece , Posicao position){ 
       if (thereIsAPiece(position)) {
        throw new BoardExcepition("Já tem uma peça nessa posição " + position);
        
       } 
       
       /// na posição informado e add a peça
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
     }
     /*
      * METODO REMOVER PEÇA DO TABULEIRO 
      */
     public Peca removePiece(Posicao position){
        if(!positionExists(position)){
            throw new BoardExcepition("Posição invalida ");
        }
        if(piece(position) == null){
            return null;
        }
        Peca aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()]=null;
        
        return aux;
     }
/*
 * metodos para verificar se uma posição é valida
 */
     private boolean positionExists(int row , int column){
        return row >= 0 && row < rows && column >= 0 && column < collumns;
     }

     public boolean positionExists(Posicao position){
        return positionExists(position.getRow(),position.getColumn());
     }

     public boolean thereIsAPiece(Posicao position){
        if(!positionExists(position)){
            throw new BoardExcepition("Posição fora do tabuleiro  ");
        }
      return piece(position) != null;
     }
}
