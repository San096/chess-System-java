package ChessPiece;


import BordGamer.Board;
import BordGamer.Position;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece {

    public Torre(Board board, Color color) {
        super(board, color);
        
    }


    @Override

    public String toString(){
        return this.getColor().equals(Color.WHITE) ? "T " : "t ";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] Mat = new boolean[getBord().getRows()][getBord().getCollumns()];

        Position p = new Position(0,0);

        p = setValues(position.getRow()-1 , position.getColumn());

        
        return Mat;
    }
}
