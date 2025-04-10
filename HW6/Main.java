import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namings = {
                "Молоко",
                "Хлеб",
                "Гречневая крупа",
                "Вода"
        };
        int[] costs = {
                50,
                14,
                80,
                25
        };
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < namings.length; ++i) {
            System.out.println(String.valueOf(i + 1) + ". " + namings[i] + " " + costs[i] + " руб/шт");
        }

        int[] quantity = new int[namings.length];
        while (true) {
            System.out.println("Выберите товар и количество или введите end:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productQuantity = Integer.parseInt(parts[1]);
            quantity[productNumber] += productQuantity;
        }
        System.out.println("Ваша корзина:");
        int sum = 0;
        for (int i = 0; i < namings.length; ++i) {
            if (quantity[i] > 0) {
                System.out.println(namings[i] + " " + quantity[i] + " шт " + costs[i] + " руб/шт " + costs[i] * quantity[i] + " руб в сумме");
                sum += costs[i] * quantity[i];
            }
        }
        System.out.println("Итого " + sum + " руб");
    }
}
