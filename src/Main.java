import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        // Произвольный массив. Тип и количество данных определите сами
        int [] firstArray = new int [] {1, 2 , 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        char [] randomArray = {'b', 'c' , 'd'};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        int [] firstArray = new int [] {1, 2 , 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        char [] randomArray = {'b', 'c' , 'd'};
        for (int i = 0; i < firstArray.length; i++ ) {
            System.out.print(firstArray[i]);

            if (i != firstArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++ ) {
            System.out.print(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < randomArray.length; i++ ) {
            System.out.print(randomArray[i]);

            if (i != randomArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

    }



    public static void task3 () {
        System.out.println("Задача 3");
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        int [] firstArray = new int [] {1, 2 , 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        char [] randomArray = {'b', 'c' , 'd'};
        for (int i = firstArray.length - 1; i >=0; i-- ) {
            System.out.print(firstArray[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = secondArray.length - 1; i >=0; i-- ) {
            System.out.print(secondArray[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = randomArray.length - 1; i >=0; i-- ) {
            System.out.print(randomArray[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int [] firstArray = new int [] {1, 2 , 3};
        double [] secondArray = {1.57, 7.654, 9.986};
        char [] randomArray = {'b', 'c' , 'd'};
        for (int i = 0; i < firstArray.length; i++ ) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}