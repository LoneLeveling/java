package Oops;

public class Animal {

    public void makeSound() {

        System.out.println("Animal making a sound...");
    }
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Dogo barks...");
    }
}