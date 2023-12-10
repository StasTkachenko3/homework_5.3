import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] array = new int[200];
        Random random = new Random();

        // заполняем массив случайными числами от 0 до 200
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201);
        }

        // выводим массив на консоль
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // определяем количество одноразрядных, двухразрядных и трехразрядных чисел
        int oneDigitCount = 0;
        int twoDigitCount = 0;
        int threeDigitCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                oneDigitCount++;
            } else if (array[i] < 100) {
                twoDigitCount++;
            } else {
                threeDigitCount++;
            }
        }

        // вычисляем процентное отношение
        double total = array.length;
        double oneDigitPercentage = (oneDigitCount / total) * 100;
        double twoDigitPercentage = (twoDigitCount / total) * 100;
        double threeDigitPercentage = (threeDigitCount / total) * 100;

        // выводим количество по разрядам на консоль
        System.out.println("Количество одноразрядных чисел: " + oneDigitCount + " (" + oneDigitPercentage + "%)");
        System.out.println("Количество двухразрядных чисел: " + twoDigitCount + " (" + twoDigitPercentage + "%)");
        System.out.println("Количество трехразрядных чисел: " + threeDigitCount + " (" + threeDigitPercentage + "%)");
    }
}
