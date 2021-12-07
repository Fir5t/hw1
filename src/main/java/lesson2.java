public class lesson2 {
    public static void main(String[] args) {
        from10to20( 2, 5 );
        posNeg(15);
        trFa(-15);
        strNum("Выводим стоку b-тое количество раз", 5);
        boolean season = seasons(2020);
    }
    public static boolean from10to20(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }else {
            return false;
        }
    }
    public static void posNeg(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }
    public static boolean trFa(int a){
        if (a >= 0){
            return true;
        }else{
            return false;
        }
    }
    public static void strNum(String a, int b){
        for (int i = 0; i < b; i++)
        System.out.println(a);
    }
    public static boolean seasons(int a) {
        if (a % 400 == 0) {
        }if (a % 4 == 0) {
            return true;
        } else if (a != 100) {
            return false;
        }
        return false;
    }
}


