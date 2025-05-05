import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordChecker passwordChecker = new PasswordChecker();
        try {
            System.out.println("Введите мин. длину пароля:");
            int minLength = scanner.nextInt();
            passwordChecker.setMinLength(minLength);
            System.out.println("Введите макс. допустимое количество повторений символа подряд:");
            int maxRepeats = scanner.nextInt();
            passwordChecker.setMaxRepeats(maxRepeats);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        while (true) {
            System.out.println("Введите пароль или end:");
            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println("Программа завершена");
                break;
            }
            if (passwordChecker.verify(input)) {
                System.out.println("Подходит!");
            } else {
                System.out.println("Не подходит!");
            }
        }
    }
}
