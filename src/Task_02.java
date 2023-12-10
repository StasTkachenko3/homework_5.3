import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        int[] array = new int[20];
        Random random = new Random();

        // заполняем массив случайными числами от -10 до 30
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 10;
        }

        // выводим массив на консоль
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // определяем сумму элементов массива, находящихся после первого отрицательного элемента
        int sum = 0;
        boolean negativeFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && !negativeFound) {
                negativeFound = true;
            } else if (negativeFound) {
                sum += array[i];
            }
        }

        // выводим сумму на консоль
        System.out.println("Сумма элементов после первого отрицательного элемента: " + sum);
    }
}

