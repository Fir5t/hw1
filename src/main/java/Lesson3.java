import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        fromZeroToOne();
        fromZeroToHundred();
        sixToTwo();
        diagonal();
        int[] arrayTo = arrayTo(15, 10);
        System.out.println(Arrays.toString(arrayTo));
        int[] arr = {1, 5, 15, 2, 11, 4, 97, 2, 4, 8, 9, 43};
        minMax(arr);
        int[] halfArr = {1, 10, 12, 4, 6, 5, 4, 32, 1, 2, 5};
        System.out.println(halfMassive(halfArr));
    }
    //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void fromZeroToOne() {
        int[] arr = {0, 1, 0, 1, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;
            } else {
                arr[i] -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fromZeroToHundred() {
        int[] arr = new int[100];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void sixToTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,  1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
    // диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void diagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка
    // которого равна initialValue;
    public static int[] arrayTo(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
   public static void minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
       System.out.println(Arrays.toString(arr));
       System.out.println("min = " + min + " " +  "max = " + max);
    }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    public static boolean halfMassive(int[] halfArr) {
        int leftSum = 0;
         for (int i = 0; i < halfArr.length; i++){
             leftSum += halfArr[i];
         int rightSum = 0;
         for (int j = 0; j < halfArr.length; j++){
             rightSum += (j > i)? halfArr[j] : 0;
         }
         if(leftSum == rightSum){
             return true;
         }
    }
         return false;
    }

    }







