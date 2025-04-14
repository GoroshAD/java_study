import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;
    public static final int DOWN_LIMIT = 0;
    public static final int UPPER_LIMIT = 256;
    public static final int MULTIPLICITY = 90;   // кратность угла

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[SIZE][SIZE];
        matrixFiller(matrix);
        System.out.println("Дана следующая матрица:");
        matrixPrinter(matrix);
        System.out.println("Введите угол, на который хотите повернуть матрицу (90, 180, 270):");
        int angle = scanner.nextInt();
        for (int i = 0; i < angle / MULTIPLICITY; ++i) {
            matrix = matrixRotator(matrix);
        }
        System.out.println("Вывод:");
        matrixPrinter(matrix);
    }

    public static void matrixFiller(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                matrix[i][j] = random.nextInt(DOWN_LIMIT, UPPER_LIMIT);
            }
        }
    }

    public static void matrixPrinter(int[][] matrix) {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();   // просто разделитель, чтобы был небольшой отступ от выведенной матрицы
    }

    public static int[][] matrixRotator(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                rotatedMatrix[j][SIZE - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}
