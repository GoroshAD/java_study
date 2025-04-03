public class Main {
    public static void main(String[] args) {
        Author author = new Author("Николай", "Гоголь", 41);
        Book book = new Book("Мертвые души", 1842, author, 352);

        System.out.println(book.isBig());
        System.out.println(book.matches("души"));
        System.out.println(book.estimatePrice());
    }
}
