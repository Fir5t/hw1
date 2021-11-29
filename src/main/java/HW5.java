import java.util.Random;
import java.util.Scanner;

public class HW5 {
    public static final int size = 3;
    public static char[][] map;
    public static final char dot_empty = '*';
    public static final char dot_x = 'X';
    public static final char dot_o = 'O';
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(dot_x)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(dot_o)) {
                System.out.println("ИИ победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Конец игры");
        scanner.close();
    }

// Метод проверяет линии
    public static boolean checkLine(int start_x, int start_y, int dx, int dy, char symbol) {
        for (int i = 0; i < size; i++) {
            if (map[start_x + i * dx][start_y + i * dy] != symbol)
                return false;
        }
        return true;
    }

    // Метод проверки победителя
    public static boolean checkWin(char symbol) {
        for (int i = 0; i < size; i++) {
            //Проверяем строки
            if (checkLine(i, 0, 0, 1, symbol))
                return true;
            // Проверяем столбцы
            if (checkLine(0, i, 1, 0, symbol))
                return true;
        }
        //Проверяем диагонали
        if (checkLine(0, 0, 1, 1, symbol))
            return true;
        if (checkLine(0, size - 1, 1, -1, symbol))
            return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty)
                    return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isSellBusy(x, y));
        System.out.println("ИИ сходил в  " + (x + 1) + " " + (y + 1));
        map[y][x] = dot_o;
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите число в ввиде координат X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isSellBusy(x, y));
        map[y][x] = dot_x;
    }

    public static boolean isSellBusy(int x, int y) {
        if (x < 0 || x > size || y < 0 || y > size) {
            return false;
        }
        if (map[y][x] == dot_empty) {
            return true;
        }
        return false;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

