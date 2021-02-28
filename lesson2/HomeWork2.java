package lesson2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        /** 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0; */

        System.out.println("ЗАДАНИЕ 1:");
        // Задаем массив
        int[] ex1Array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1};
        System.out.print("Изначальный массив: ");
        for (int i = 0; i < ex1Array.length; i++) {
            System.out.print(ex1Array[i] + " | ");
        }
        // Выводим новый массив
        System.out.println();
        System.out.print("Измененный массив:  ");
        for (int i = 0; i < ex1Array.length; i++) {
            // используем обычный условный оператор
            if (ex1Array[i] == 1) {
                ex1Array[i] = 0;
            } else ex1Array[i] = 1;
            // но можно и тернарный - тоже будет работать
//            ex1Array[i] = (ex1Array[i] == 1) ? (ex1Array[i] = 0) : (ex1Array[i] = 1);
            System.out.print(ex1Array[i] + " | ");
        }

        /** 2. Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22 */
        System.out.println();
        System.out.println("ЗАДАНИЕ 2:");
        // Задаем массив
        int[] ex2Array = new int[8];
        // Заполняем массив
        System.out.print("Массив со значениями через 3:   ");
        for (int i = 0; i < ex2Array.length; i++) {
            ex2Array[i] = (i == 0) ? 1 : (ex2Array[i - 1] + 3); // в этот раз сразу используем тернарный оператор
            System.out.print(ex2Array[i] + " | ");
        }

        /** 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2 */
        System.out.println();
        System.out.println("ЗАДАНИЕ 3:");
        // Задаем массив
        int[] ex3Array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Изначальный массив: ");
        for (int i = 0; i < ex3Array.length; i++) {
            System.out.print(ex3Array[i] + " | ");
        }
        // вызываем метод
        multiplier(ex3Array);

        /** 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента; */
        System.out.println();
        System.out.println("ЗАДАНИЕ 4:");
        // Задаем массив
        int[] ex4Array = new int[10];
        // вызываем методы
        System.out.print("Рандомный массив от 0 до 20:  ");
        rndFillArray(ex4Array);
        findMinMax(ex4Array);

        /** 5*. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы) */
        System.out.println();
        System.out.println("ЗАДАНИЕ 5:");
        // зададим двумерный массив со значениями от 10 до 19 и с единицами по-диагонали
        int limitArray = 10; // переменная будет хранить размер массива
        int[][] tableArray = new int[limitArray][limitArray];
        for (int x = 0; x < tableArray.length; x++) {
            for (int y = 0; y < tableArray[x].length; y++) {
                int rndVarX = (int) ((Math.random() + 1) * 10); // создадим переменную принимающую значения от 10 до 19
                if ((x != y) & (x + y != limitArray - 1)) {
                    tableArray[x][y] = rndVarX;
                } else {
                    tableArray[x][y] = 1;
                }
                System.out.print(tableArray[x][y] + "\t");
            }
            System.out.println();
        }
        /** 6**.  Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
         * при этом метод должен циклически сместить все элементы массива на n позиций.
         [1,2,3,4,5], -2 => [3,4,5,1,2]
         [1,2,3,4,5], 2 => [4,5,1,2,3]
         Не пользоваться вспомогательным массивом при решении задачи 6.*/
        System.out.println();
        System.out.println("ЗАДАНИЕ 6-7:");
        // Задаем массив
        int arrayRange = 5; // переменная задает длинну массива
        int[] ex6Array = new int[arrayRange];
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < arrayRange; i++) {
            ex6Array[i] = i + 1;
            System.out.print(ex6Array[i] + " | ");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число смещения (положительное - смещение вправо, отрицательное - смещение влево): ");
        int shift = in.nextInt();
        slider(shift, ex6Array);
    }

    /**
     * Создаем метод для Задания 3
     */
    public static void multiplier(int[] arrayIn) {
        System.out.println();
        System.out.print("Измененный массив:  ");
        for (int i = 0; i < arrayIn.length; i++) {
            arrayIn[i] = (arrayIn[i] < 6) ? (arrayIn[i] * 2) : arrayIn[i];
            System.out.print(arrayIn[i] + " | ");
        }
    }

    /**
     * Создаем методы для Задания 4
     */
    // Первый метод заполнит массив случайными числами от 0 до 19
    public static int[] rndFillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20);
            System.out.print(numbers[i] + " | ");
        }
        return numbers;
    }

    // Второй метод будет искать максимальные и минимальные элементы
    public static void findMinMax(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            } else if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное занчение: " + minValue);
        System.out.println("Максимальное занчение: " + maxValue);
    }

    /**
     * Создаем метод для Задания 6
     */
    public static void slider(int shift, int[] arrayIn) {
        shift = shift % arrayIn.length; // убираем циклические повторы массива
        int[] bufferArray = new int[arrayIn.length]; // зададим буферный массив
        if (shift >= 0) {
            System.out.println("Новый массив: ");
            System.arraycopy(arrayIn, shift, bufferArray, 0, arrayIn.length - shift); // из arrayIn передаем в bufferArray значения, начиная с shift, в индекс 0, т.е. с самого начала буферного массива на величину массива arrayIn - смещение shift
            System.arraycopy(arrayIn, 0, bufferArray, arrayIn.length - shift, shift); // по аналогии добавляем оставшиеся элементы в буферный массив
            for (int i = 0; i < bufferArray.length; i++) {
                System.out.print(bufferArray[i] + " | ");
            }
        } else {
            shift = Math.abs(shift); // берем значение по модулю
//            System.out.println(shift);
            System.out.println("Новый массив: ");
            System.arraycopy(arrayIn, shift, bufferArray, 0, arrayIn.length - shift); // теперь все то же, но в другую сторону
            System.arraycopy(arrayIn, 0, bufferArray, arrayIn.length - shift, shift);
            for (int i = 0; i < bufferArray.length; i++) {
                System.out.print(bufferArray[i] + " | ");
            }
        }

    }
}


