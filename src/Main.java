
interface Animal{
    void sound();
    default void sleep() {
        System.out.println("zwierze idzie spac");
    }
    public static void endOfDay(){
        System.out.println("dzien sie konczy");
    }
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof Woof!");
    }
}

class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Meow Meow!");
    }
}

class Bird implements Animal{

    @Override
    public void sound() {
        System.out.println("Tweet Tweet!");
    }
}

class Cow implements Animal{

    @Override
    public void sound() {
        System.out.println("Moo Moo!");
    }
}




public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        dog.sleep();
        cat.sound();
        cat.sleep();
        Bird bird = new Bird();
        bird.sound();
        bird.sleep();
        Cow cow = new Cow();
        cow.sound();
        cow.sleep();

    }
}