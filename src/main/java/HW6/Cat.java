package HW6;

public class Cat extends Animal {
    private int getDistanceRun;
    private int getDistanceSwim;
    private String getName;
    public static int CAT_COUNT = 0;

    public Cat(int getDistanceSwim, int getDistanceRun, String getName) {
        super();
        this.getDistanceRun = getDistanceRun;
        this.getDistanceSwim = getDistanceSwim;
        this.getName = getName;
        CAT_COUNT++;
    }

    public void run(int distance){
        if (distance > getDistanceRun){
            System.out.println("Кот " + getName +  " не может пробежать " + distance + " м." + " А бегает только на " + getDistanceRun);
        }else {
            System.out.println("Кот " + getName + " пробежал " + distance + " м ");
        }
    }

    public void swim(int distance){
        if(distance >= 0){
            System.out.println("Кот не умеет плавать");
        }
    }

    public int getGetDistanceRun() {
        return getDistanceRun;
    }

    public void setGetDistanceRun(int getDistanceRun) {
        this.getDistanceRun = getDistanceRun;
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public int getGetDistanceSwim(int distance) {
        if (this.getDistanceSwim>0 ){
            System.out.println("Кот не умеет плавать");
        }
        return getDistanceSwim;
    }

    public void setGetDistanceSwim(int getDistanceSwim) {
        this.getDistanceSwim = getDistanceSwim;
    }

    public int getGetDistanceSwim() {
        return getDistanceSwim;
    }

    public static int getCatCount() {
        return CAT_COUNT;
    }

    public static void setCatCount(int catCount) {
        CAT_COUNT = catCount;
    }
}
