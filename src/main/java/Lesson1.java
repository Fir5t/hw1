public class Lesson1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumber();
    }

    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSing(){
        int a = -14;
        int b = 25;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = 150;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumber(){
        int a = 45;
        int b = 35;
        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
