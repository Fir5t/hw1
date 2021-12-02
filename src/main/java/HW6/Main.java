package HW6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 150, "Murzik");
        Dog dog = new Dog(500, 200, "Tobik");
        Dog dog2 = new Dog(300, 30, "Barni");
        Cat cat1 = new Cat(15, 25, "Nata");
        Cat cat2 = new Cat(0,500,"Mysya");

        Animal animal = new Animal();
        Animal animal1 = new Animal(10, 20, "Kotya");


        cat.run(250);
        dog.run(600);
        dog.swim(150);
        cat.swim(10);
        cat1.run(120);
        cat2.swim(6);
        dog2.run(120);
        dog.swim(550);
        System.out.println("Всего собак " +  Dog.DOG_COUNT);
        System.out.println("Всего котов " + Cat.CAT_COUNT);
        System.out.println(Animal.COUNT);

    }
}
