package HW7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int add) {
        food += add;
        System.out.println("В чашку добавили " + add + " еды и теперь в чашке " + food + " еды");
    }

    public void decreaseFood(Cat cat) {
        if (cat.getAppetite() > food){
            System.out.println("В тарелке недостаточно еды, " + cat.getName() + " остался голодным");
        }else {
            food -= cat.getAppetite();
            cat.setSatiety(true);
            System.out.println("Кот " + cat.getName() + " поел и наелся, осталось " + food + " еды");
        }
    }


    public void info() {
        System.out.println("Количество еды: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

