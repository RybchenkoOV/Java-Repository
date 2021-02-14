package lesson1;

/**
 * HOMEWORK LESSON 1
 */

import java.util.Scanner;

/** Задание 1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода */
//
//public class FirstClass {
//    public static void main(String[] args) {
//
//        // Создаем переменные, вводим в них данные для передачи потом в мат.метод.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a = ");
//        int a = in.nextInt();
//        System.out.print("Введите число b = ");
//        int b = in.nextInt();
//        System.out.print("Введите число c = ");
//        int c = in.nextInt();
//        System.out.print("Введите число d = ");
//        int d = in.nextInt();
//
//        // Запускаем метод, передавая в него переменные a, b, c, d
//        System.out.print("Рассчет по формуле: a * (b + (c / d)) = ");
//        float result = mathMethod(a, b, c, d);
//        System.out.print(result);
//    }
//
//    // Создаем мат.метод
//    public static float mathMethod(int argA, int argB, int argC, int argD) {
//        return argA * (argB + (argC / argD));
//    }
//}

/** Задание 2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false */
//public class FirstClass {
//    public static void main(String[] args) {
//
//        // Создаем переменные, вводим в них данные для передачи потом в метод.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число 1 = ");
//        int numA = in.nextInt();
//        System.out.print("Введите число 2 = ");
//        int numB = in.nextInt();
//
//        // Запускаем метод, передавая в него переменные numA, numB
//        System.out.print("Сумма чисел в пределах (10, 20] = ");
//        boolean result = checkNumbers(numA, numB);
//        System.out.print(result);
//    }
//
//    // Создаем метод
//    public static boolean checkNumbers(int argA, int argB) {
//        int sum = argA + argB;
//        if (sum > 10 && sum <= 20) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//}

/** Задание 3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное.
 *  Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль */
//public class FirstClass {
//    public static void main(String[] args) {
//
//        // Создаем переменную, вводим в нее данные для передачи потом в метод.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число = ");
//        int numA = in.nextInt();
//
//        // Запускаем метод, передавая в него чило из переменной
//        System.out.print("Ваше число: ");
//        String result = posOrNeg(numA);
//        System.out.print(result);
//    }
//
//    // Создаем метод
//    public static String posOrNeg(int argA) {
//        if (argA >= 0) {
//            return "положительное";
//        }
//        else {
//            return "отрицательное";
//        }
//    }
//}

/** Задание 4. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль. */
//public class FirstClass {
//    public static void main(String[] args) {
//
//        // Создаем переменную, вводим в нее данные для передачи потом в метод.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите имя = ");
//        String name = in.next();
//
//        // Запускаем метод, передавая в него переменные a, b, c, d
//        System.out.print("Привет, ");
//        String result = namer(name+"!");
//        System.out.print(result);
//    }
//
//    // Создаем метод
//    public static String namer(String argA) {
//        return argA;
//        }
//}

/** Задание 5. Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 * Для проверки работы вывести результаты работы метода в консоль */
//public class FirstClass {
//    public static void main(String[] args) {
//
//        // Создаем переменную, вводим в нее данные для передачи потом в метод.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите год = ");
//        int year = in.nextInt();
//
//        // Запускаем метод, передавая в него введенный в переменную год
//        System.out.print("Год " + year + ": ");
//
//        String result = checkYears(year);
//        System.out.print(result);
//    }
//
//    // Создаем метод
//    public static String checkYears(int argA) {
//        if (argA % 4 == 0) {
//            if (argA % 100 == 0) {
//                if (argA % 400 == 0) {
//                    return "високосный";
//                }
//                return "обычный";
//            }
//            return "високосный";
//        }
//        else {
//            return "обычный";
//        }
//    }
//}