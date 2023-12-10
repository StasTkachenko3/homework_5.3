import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int value = 1; // Начальное значение

        for (int i = 0; i < n + m - 1; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k >= 0 && k < m) {
                    array[j][k] = value++;
                }
            }
        }

        // Вывод массива на экран с соблюдением ширины столбцов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%-4d", array[i][j]);
            }
            System.out.println();
        }
    }
}


