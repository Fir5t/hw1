package HW6;


public class Animal {
    private int getDistanceRun;
    private int getDistanceSwim;
    private String getName;
    public static int COUNT = 0;

    public Animal() {
        COUNT++;
    }

    public Animal(int getDistanceRun, int getDistanceSwim, String getName) {
        this.getName = getName;
        this.getDistanceSwim = getDistanceSwim;
        this.getDistanceRun = getDistanceRun;
        COUNT++;
        System.out.println(COUNT);
    }
}




