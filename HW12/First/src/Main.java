import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address moscow = new Address("Russia", "Moscow");
        Address miami = new Address("USA", "Miami");
        Address sofia = new Address("Bulgaria", "Sofia");
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(moscow, 1000);
        costPerAddress.put(miami, 5000);
        costPerAddress.put(sofia, 2500);

        Scanner scanner = new Scanner(System.in);
        int allCost = 0;
        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scanner.next();
            System.out.print("Введите город: ");
            String city = scanner.next();
            System.out.print("Введите вес (кг): ");
            int weight = scanner.nextInt();

            Address address = new Address(country, city);
            if (costPerAddress.containsKey(address)) {
                int cost = weight * costPerAddress.get(address);
                System.out.println("Стоимость доставки составит: " + cost + " руб.");
                allCost += cost;
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
            System.out.println("Общая стоимость всех доставок: " + allCost+ " руб.");
            System.out.println();   // отступ

            System.out.print("Хотите завершить? Введите yes/no: ");
            String ans = scanner.next();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Программа завершена!");
                return;
            }// иначе продолжаем
            System.out.println();   // отступ
        }
    }
}
