import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Здравствуйте, введите пожалуйста цену товара (в руб.): ");
        int cost = scanner.nextInt();
        System.out.print("А теперь введите пожалуйста вес товара (в кг.): ");
        int weight = scanner.nextInt();
        int customsCost = CustomsService.calculateCustoms(cost, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + customsCost);
    }
}
