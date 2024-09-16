package Aplication;
import java.util.*;

import chess.ChessExeption;
import chess.ChessPiece;
import chess.ChessPosition;

public class IO{

	public static ChessPosition readChessPosition(Scanner sc){
		try{
            String s = sc.nextLine();
            char coluns = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(coluns, row);
		}catch(ChessExeption e){
            throw new ChessExeption("posiçoes invalidas , posições validas somente de a1 ate h8");
        }
    }
 

    public static void printBoard(ChessPiece[] [] pieces){
        for(int i = 0; i< pieces.length; i ++){
            System.out.print((1 + i ) + "  ");
            for (int j = 0 ;j < pieces.length ;j++){
                printpiece(pieces[i][j]);

            }
            System.out.println();
        }
        System.out.print("\n   a b c d e f g h");

    }

    public static void printpiece(ChessPiece Piece){
        if (Piece == null){
            System.out.print("* ");
        }
        else {
            System.out.print(Piece);
        }
    }
}