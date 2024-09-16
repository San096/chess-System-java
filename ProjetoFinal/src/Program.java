
import java.util.*;
import Aplication.IO;
import BordGamer.Board;
import BordGamer.Position;
import chess.ChessExeption;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);


        while (true) {
            IO.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("POSIÇÃO DE ORIGEM ");
            ChessPosition source = IO.readChessPosition(sc);

            System.out.println();
            System.out.println("POSIÇÃO DE DESTINO");
            ChessPosition target = IO.readChessPosition(sc);
            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);        
        }
        
     
       
       




    }
    

}
