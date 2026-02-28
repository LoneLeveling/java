package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setItem("Apple");
        System.out.println(b.getItem());
    }
}
