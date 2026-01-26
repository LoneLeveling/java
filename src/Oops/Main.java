package Oops;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal= new Dog();
        myAnimal.makeSound();
        myAnimal=new Cat();
        myAnimal.makeSound();
    }
}
