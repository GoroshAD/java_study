import java.util.*;

public class Main {
    public static void main(String[] args) {
        Address moscow = new Address("Russia", "Moscow");
        Address tula = new Address("Russia", "Tula");
        Address miami = new Address("USA", "Miami");
        Address newYork = new Address("USA", "New-York");
        Address sofia = new Address("Bulgaria", "Sofia");
        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(moscow, 1000);
        costPerAddress.put(tula, 1250);
        costPerAddress.put(miami, 5000);
        costPerAddress.put(newYork, 5500);
        costPerAddress.put(sofia, 2500);

        Scanner scanner = new Scanner(System.in);
        int allCost = 0;
        Set<String> uniqueCountries = new HashSet<>();
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
                uniqueCountries.add(address.getCountry());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
            System.out.println("Общая стоимость всех доставок: " + allCost+ " руб.");
            System.out.println("Количество уникальных стран для отправки: " + uniqueCountries.size());
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