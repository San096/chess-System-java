package BordGamer;

import chess.ChessPiece;

public class Board {
    private int rows;
    private int collumns;
    private Piece[] [] pieces;

    public Board(int rows, int collumns) {
        if (rows < 1 || collumns < 1) {
            throw new BoradExcepition("Erro ao criar tabuleiro  e necessario ter pelomenos 1 linha e 1 coluna"); 
        }
        this.rows = rows;
        this.collumns = collumns;
        pieces = new Piece[rows][collumns]; // a matriz iniciara com a quantidades de linha e colunas informadas 
    }
    public int getRows() {
        return rows;
    }
    public int getCollumns() {
        return collumns;
    }
   

    public Piece piece(int row ,int column){
        if(!positionExists(row ,column)){
            throw new BoradExcepition("fora do tabuleiro  ");
        }
        return pieces[row] [column];
    }
     public Piece piece(Position position){ // sobreposição do metodo piece
        if(!positionExists(position)){
            throw new BoradExcepition("Posição fora do tabuleiro  ");
        }
         return pieces[position.getRow()] [position.getColumn()];
     }

// metodo colocar peça no tabuleiro
     public void  placePiece(Piece piece , Position position){ 
       if (thereIsAPiece(position)) {
        throw new BoradExcepition("Já tem uma peça nessa posição " + position);
        
       } 
       
       /// na posição informado e add a peça
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
     }
     /*
      * METODO REMOVER PEÇA DO TABULEIRO 
      */
     public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoradExcepition("Posição invalida ");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
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

     public boolean positionExists(Position position){
        return positionExists(position.getRow(),position.getColumn());
     }

     public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){
            throw new BoradExcepition("Posição fora do tabuleiro  ");
        }
      return piece(position) != null;
     }
}
