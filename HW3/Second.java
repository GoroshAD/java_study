import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;
        while (true) {
            System.out.print("Введите год в формате 'yyyy': ");
            int year = scanner.nextInt();
            int rightAnswer = (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? 366 : 365;
            System.out.print("Введите количество дней: ");
            int days = scanner.nextInt();
            if (days == rightAnswer) {
                ++points;
            } else {
                System.out.println("Неправильно! В этом году " + rightAnswer + " дней!");
                break;
            }
        }

        System.out.println("Набрано очков: " + points);
    }
}
