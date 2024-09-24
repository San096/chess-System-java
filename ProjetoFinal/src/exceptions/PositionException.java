package exceptions;

/**
 * Exceção para quando uma posição selecionada for nula
 */
public class PositionException extends NullPointerException {
  public PositionException(String message) {
    super(message);
  }
}