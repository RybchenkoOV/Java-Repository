package lesson3;

import java.awt.image.ShortLookupTable;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static int xWarn; // переменная класса для предупрежения о 3-х по-горизонтали
    public static int yWarn; // переменная класса для предупрежения о 3-х по-вертикали
    public static int zWarn; // переменная класса для предупрежения о 3-х по-диагонали
    public static int tempX; // временная переменная класса для хранения Х координаты
    public static int tempY; // временная переменная класса для хранения Y координаты

    public static char[][] map;
    public static int xSize;
    public static int ySize;
    public static char playerIcon = 'X';
    public static char aiIcon = 'O';
    public static char emptyCell = '*';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void mapBuilder() {
        xSize = 5;
        ySize = 5;
        map = new char[xSize][ySize];
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                map[x][y] = emptyCell;
            }
        }
    }

    public static void getMap() {
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                System.out.print(map[x][y] + " | ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isValidTurn(int x, int y) {
        return x >= 0 && x < xSize && y >= 0 && y < ySize;
    }

    public static boolean isEmpty(int x, int y) {
        return map[y][x] == emptyCell;
    }

    public static boolean isWinner(char player) {
        int horizChars = 1; // локальная переменная - счетчик совпадений по-горизонтали
        int vertChars = 1;  // локальная переменная - счетчик совпадений по-вертикали
        int diagChars = 1;  // локальная переменная - счетчик совпадений по-диагонали
        /** Цикл для проверки вправо */
        for (int x = 0; x < xSize - 1; x++) {
            for (int y = 0; y < ySize - 1; y++) {
                if (map[x][y] == map[x + 1][y] && map[x][y] == player) {
                    vertChars++;
                    if (vertChars == 3) {   // Если по-вертикали счетчик показывает 3 то:
                        tempX = x + 2;      // внести во временную переменную победную координату по Х
                        tempY = y;          // внести во временную переменную победную координату по Y
                    }
                } else if (map[x][y] == map[x][y + 1] && map[x][y] == player) {
                    horizChars++;
                    if (horizChars == 3) {   // Если по-горизонтали счетчик показывает 3 то:
                        tempX = x;           // внести во временную переменную победную координату по Х
                        tempY = y + 2;       // внести во временную переменную победную координату по Y
                    }
                } else if (map[x][y] == map[x + 1][y + 1] && map[x][y] == player) {
                    diagChars++;
                    if (diagChars == 3) {    // Если по-диагонали 1 счетчик показывает 3 то:
                        tempX = x + 2;       // внести во временную переменную победную координату по Х
                        tempY = y + 2;       // внести во временную переменную победную координату по Х
                    }
                }
            }
        }
        /** Отдельный цикл для второй диагонали, т.к. там другие точки отсчета */
        for (int x = 1; x < xSize - 1; x++) {
            for (int y = 1; y < ySize - 1; y++) {
                if (map[x][y] == map[x - 1][y + 1] && map[x][y] == player) {
                    diagChars++;
                    if (diagChars == 3) {    // Если по-диагонали 2 снизу счетчик показывает 3 то:
                        tempX = x - 2;       // внести во временную переменную победную координату по Х
                        tempY = y + 2;       // внести во временную переменную победную координату по Y
                    }
                } else if (map[x][y] == map[x + 1][y - 1] && map[x][y] == player) {
                    horizChars++;
                    if (horizChars == 3) {   // Если по-горизонтали 2 сверху счетчик показывает 3 то:
                        tempX = x + 2;           // внести во временную переменную победную координату по Х
                        tempY = y - 2;       // внести во временную переменную победную координату по Y
                    }

                }
            }
        }
        /** Для удобства отслеживагния комбинаций для каждого игрока отображаем счетчик собранных комбинаций */
        System.out.println(player + ": " + "horiz = " + horizChars + " vert = " + vertChars + " diag = " + diagChars);
        if (player == playerIcon) {        // В случае хода игрока:
            xWarn = horizChars;            // Помещаем значение локального счетчика в переменную класса по Х
            yWarn = vertChars;             // Помещаем значение локального счетчика в переменную класса по Y
            zWarn = diagChars;             // Помещаем значение локального счетчика в переменную класса по Z
        }
        return (horizChars == 4) || (vertChars == 4) || (diagChars == 4); // Т.к. метод Булевый, то он вернет true при выполнении одного из трех условий
    }

    public static boolean checkDraw() {    // проверка ничьей
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                if (map[x][y] == emptyCell) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void playerTurn() {
        int x;
        int y;

        do {
            System.out.println("Input coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isValidTurn(x, y) || !isEmpty(x, y));
        map[y][x] = playerIcon;
    }

    public static void aiTurn() {
        int x = 0;
        int y = 0;

        /** Реализации ИИ. При совпадении с одной из меременных класса по X, Y, Z поставить нолик по координатам из временных координат класса по X и Y */
        if (xWarn == 3 || yWarn == 3 || zWarn == 3) {
            System.out.println("xWarn = " + xWarn);
            map[tempX][tempY] = aiIcon;
        }
        /** иначе делать рандомные ходы */
        else {
            do {
                x = random.nextInt(xSize);
                y = random.nextInt(ySize);

            } while (!isEmpty(x, y));

            map[y][x] = aiIcon;
        }
    }

    public static void main(String[] args) {

        mapBuilder();
        getMap();

        while (true) {
            playerTurn();
            getMap();
            if (isWinner(playerIcon)) {
                System.out.println("Player (X) WINS!!!");
                break;
            }
            if (checkDraw()) {
                System.out.println("DRAW!!!");
                break;
            }

            aiTurn();
            getMap();
            if (isWinner(aiIcon)) {
                System.out.println("AI (O) WINS!!!");
                break;
            }
            if (checkDraw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }
}

