public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(String text) {
        super("Передано неверное значение: " + text);
    }
}
