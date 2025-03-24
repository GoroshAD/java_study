import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите, пожалуйста, интересующий вас год в формате 'yyyy': ");
        int year = scanner.nextInt();
        System.out.print("Количество дней в году равно ");
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }
    }
}
