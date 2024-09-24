package board;

import exceptions.PositionException;

/**
 * Classe que define como funciona as coordenadas do tabuleiro
 */
public class Position {
    private int row;
    private int column;
  
    // Ainda não sei se irei usar todos esses 3 construtores, mas eu acho que sim
    public Position(char columnLetter, int row) {
      this.row = row - 1; // Ajustando para posição em array
      this.column = convertColumnLetterToNumber(columnLetter);
    }
  
    public Position(int row, int column) {
      this.row = row - 1; // Ajustando para posição em array
      this.column = column - 1; // Ajustando para posição em array
    }
  
    public Position(String position) {
      if(position.length() != 2) {
        throw new PositionException("\nERRO!!!! Posição inválida\n");
      }
      this.row = Integer.parseInt(position.substring(1)) - 1; // Ajustando para posição em array
      this.column = convertColumnLetterToNumber(position.charAt(0));
    }

    public int getRow() {
      return row;
    }
  
    public void setRow(int row) {
      this.row = row - 1; // Ajustando para posição em array
    }
  
    public int getColumn() {
      return column;
    }
  
    public void setColumn(int column) {
      this.column = column - 1; // Ajustando para posição em array
    }
  
  
    public static boolean isValidPosition(Position position) {
      return position.getRow() >= 0 && position.getRow() < 8 && position.getColumn() >= 0 && position.getColumn() < 8;
    }
  
    /**
     * Converte uma coluna em letra para um número, independente se a letra for maiuscula ou minuscula
     **/ 


    private int convertColumnLetterToNumber(char columnLetter) {
      char lowerCaseLetter = Character.toLowerCase(columnLetter);
      return lowerCaseLetter - 'a';
    }
  
    /**
     * Nesse toString() a gente mostra a posição da seguinte forma: (A1, B2, C3, D4,
     * E5, F6, G7, H8)
     */
    @Override
    public String toString() {
      char columnLetter = (char) (column + 'A');
      return "Position:" + columnLetter + (row + 1);
    }
  }