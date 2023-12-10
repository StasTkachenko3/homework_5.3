import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int[] sourceArray = new int[100];
        int[] resultArray = new int[100];
        Random random = new Random();

        // Заполняем исходный массив случайными числами от -300 до 555
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(856) - 300;
        }

        // Выводим исходный массив на консоль
        System.out.println("Исходный массив:");
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.print(sourceArray[i] + " ");
        }
        System.out.println();

        int index = 0;

        // Копируем последовательно все элементы, большие 0
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        // Копируем последовательно все элементы, равные 0
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] == 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        // Копируем последовательно все элементы, меньшие 0
        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < 0) {
                resultArray[index] = sourceArray[i];
                index++;
            }
        }

        // Выводим результирующий массив на консоль
        System.out.println("Результирующий массив:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}

