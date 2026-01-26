package Oops;

public class CarController {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="toyota supra        ";
        car.speed=80;
        car.color="black";
        car.year=2026;

        car.accelerate(2);
        System.out.println(car.speed);
    }
}
