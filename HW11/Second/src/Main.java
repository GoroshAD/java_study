import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Deal> dealsList = new ArrayList<>();

        boolean finish = false;
        while (!finish) {
            printVariants();
            System.out.print("Ваш выбор: ");
            int usersAnswer = Integer.parseInt(scanner.nextLine());
            switch (usersAnswer) {
                case 0:
                    System.out.println("Программа завершена!");
                    finish = true;
                    break;
                case 1:
                    System.out.print("Введите название задачи: ");
                    String text = scanner.nextLine();
                    dealsList.add(new Deal(text));
                    System.out.println("Добавлено!");
                    break;
                case 2:
                    break;   // список и так выведется по умолчанию как в примере
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    int delNum = Integer.parseInt(scanner.nextLine());
                    dealsList.remove(delNum - 1);
                    System.out.println("Удалено!");
                    break;
                case 4:
                    System.out.print("Введите задачу для удаления: ");
                    Deal delDeal = new Deal(scanner.nextLine());
                    dealsList.remove(delDeal);
                    System.out.println("Удалено!");
                    break;
                case 5:
                    System.out.print("Введите ключевое слово: ");
                    String keyWord = scanner.nextLine();
                    int size = dealsList.size();
                    for (int i = 0; i < size; ++i) {
                        if (dealsList.get(i).containsWord(keyWord)) {
                            dealsList.remove(i);
                            --i;
                            --size;
                        }
                    }
                    System.out.println("Удалено!");
                    break;
                default:
                    System.out.println("Такой опции нет.");
            }
            printDeals(dealsList);
        }
    }

    public static void printVariants() {
        System.out.println("\nВыберите операцию:\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить дела по ключевому слову");
    }

    public static void printDeals(List<Deal> deals) {
        System.out.println("Ваш список дел:");
        if (deals.isEmpty()) {
            System.out.println("Пустой.");
            return;
        }
        for (int i = 1; i <= deals.size(); ++i) {
            System.out.println(i + ". " + deals.get(i - 1).getText());
        }
    }
}