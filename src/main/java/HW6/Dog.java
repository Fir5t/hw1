package HW6;

public class Dog extends Animal{
    private int getDistanceRun;
    private int getGetDistanceSwim;
    private String getName;
    public static int DOG_COUNT = 0;

    public Dog(int getGetDistanceSwim, int getDistanceRun, String getName) {
        super();
        this.getDistanceRun = getDistanceRun;
        this.getGetDistanceSwim = getGetDistanceSwim;
        this.getName = getName;
        DOG_COUNT++;
    }
    public void run(int distance){
        if(distance == 0) {
            System.out.println("Расстояние введено не верно");
        }else if (distance > getDistanceRun){
            System.out.printf("Собака %s не может пробежать больше %dм\n", getName, getDistanceRun);
        }else {
            System.out.printf("Собака %s пробежала %dм\n",getName, distance);
        }
    }
    public void swim(int distance){
        if(distance > getGetDistanceSwim){
            System.out.printf("Собака %s не может проплыть %dм\n",getName, getGetDistanceSwim);
        }else{
            System.out.printf("Собака %s проплыла %dм\n", getName, distance);
        }
    }
}
