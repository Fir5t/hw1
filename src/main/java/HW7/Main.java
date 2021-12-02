package HW7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Myrsik", 10);
        cats[1] = new Cat("Vasya", 20);
        cats[2] = new Cat("Barsik", 25);
        cats[3] = new Cat("Tolik", 15);
        cats[4] = new Cat("Kyzya", 50);

        Plate plate = new Plate(110);

        eatCats(cats, plate);
        if(!checkCats(cats)){
            plate.addFood(100);
            eatCats(cats, plate);
        }
    }

    public static void eatCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }

    public static boolean checkCats(Cat[] cats) {
        boolean result = true;
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isSatiety()) {
                result = false;
                break;
            }else{
                result = true;
            }
        }
        return result;
    }
}



