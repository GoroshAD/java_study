import java.util.Scanner;

public class First {
    public static final double USN_STONKS_PERCENT = 6.0;
    public static final double USN_STONKS_EXPENSES_PERCENT = 15.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stonks = 0.0;
        double expenses = 0.0;

        while (true) {
            printVariants();
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            int command = Integer.parseInt(input);   // приведение строки к инту
            switch (command) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    double newStonks = scanner.nextDouble();
                    stonks += newStonks;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    double newExpenses = scanner.nextDouble();
                    expenses += newExpenses;
                    break;
                case 3:
                    double usnStonksCost = usnStonks(stonks);
                    double usnStonksExpensesCost = usnStonksExpenses(stonks, expenses);
                    if (usnStonksExpensesCost == usnStonksCost) {
                        System.out.println("Можете выбрать любую систему налогообложения.");
                        System.out.println("Ваш налог составит: " + usnStonksCost + " рублей.");
                    } else if (usnStonksExpensesCost > usnStonksCost) {
                        System.out.println("Мы советуем вам УСН доходы.");
                        System.out.println("Ваш налог составит: " + usnStonksCost + " рублей.");
                        System.out.println("Налог на другой системе: " + usnStonksExpensesCost + " рублей.");
                        System.out.println("Экономия: " + (usnStonksExpensesCost - usnStonksCost) + " рублей.");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы.");
                        System.out.println("Ваш налог составит: " + usnStonksExpensesCost + " рублей.");
                        System.out.println("Налог на другой системе: " + usnStonksCost + " рублей.");
                        System.out.println("Экономия: " + (- usnStonksExpensesCost + usnStonksCost) + " рублей.");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет.");
            }
        }
        System.out.println("Программа завершена!");
    }

    // функция для вывода опций программы
    static void printVariants () {
        System.out.println("Выберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Выбрать систему налогообложения");
    }

    // функция по подсчету УСН доходов
    static double usnStonks (double stonks) {
        return stonks * USN_STONKS_PERCENT / 100;
    }

    // функция по подсчету УСН доходов минус расходов
    static double usnStonksExpenses(double stonks, double expenses) {
        return Math.abs(stonks - expenses) * USN_STONKS_EXPENSES_PERCENT / 100;
    }
}
