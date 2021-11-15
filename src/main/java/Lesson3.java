import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        fromZeroToOne();
        fromZeroToHundred();
        sixToTwo();
        diagonal();
        int[] arrayTo = arrayTo(15, 10);
        System.out.println(Arrays.toString(arrayTo));
        minMax();
    }

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

    public static void fromZeroToHundred() {
        int[] arr = new int[100];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sixToTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

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

    public static int[] arrayTo(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

   public static void minMax(){
        int[] arr = new int[10];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
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

}





