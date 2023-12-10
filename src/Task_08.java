import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        int value = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (value <= n * n) {
            // Заполнение верхней строки
            for (int i = colStart; i <= colEnd; i++) {
                array[rowStart][i] = value++;
            }
            rowStart++;

            // Заполнение правого столбца
            for (int i = rowStart; i <= rowEnd; i++) {
                array[i][colEnd] = value++;
            }
            colEnd--;

            // Заполнение нижней строки
            for (int i = colEnd; i >= colStart; i--) {
                array[rowEnd][i] = value++;
            }
            rowEnd--;

            // Заполнение левого столбца
            for (int i = rowEnd; i >= rowStart; i--) {
                array[i][colStart] = value++;
            }
            colStart++;
        }

        // Определение ширины столбцов для вывода
        int maxElement = n * n;
        int columnWidth = String.valueOf(maxElement).length() + 1;

        // Вывод массива на экран с соблюдением ширины столбцов
        for (int[] row : array) {
            for (int element : row) {
                System.out.printf("%-" + columnWidth + "d", element);
            }
            System.out.println();
        }
    }
}

