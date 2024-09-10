package chess;

import BordGamer.Position;

public class ChessPosition {
    private char columns;
    private int row;



    public ChessPosition(char columns, int row) {
        if(columns < 'a' || columns > 'h' || row < 1 || row > 8){
            throw new ChessExeption("Fora do Tabuleiro ");
        }
        this.columns = columns;
        this.row = row;
    }

    public char getColumns() {
        return columns;
    }

    public int getRow() {
        return row;
    }


     protected Position toPosition(){
        return new Position(8-row , columns-'a'); 
     }

     protected static ChessPosition  fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8- position.getRow());
     }

     @Override

     public String toString(){
        return "" + columns + row;
     }
    
}
