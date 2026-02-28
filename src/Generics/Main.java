package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setItem("Apple");
        System.out.println(b.getItem());

        Product<String, Integer, Float> product1 = new Product<>("Banana",282,80.45f);
        Product<String, Integer, Float> product2 = new Product<>("Orange",140,1210.8f);

        System.out.println(product1);//getting values via toString
        System.out.println();
        System.out.println("product1 Details: "+product1.getItem()+" "+product1.getQuantity()+" "+product1.getPrice());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(product2);//getting values via toString
        System.out.println();
        System.out.println("product2 Details: "+product2.getItem()+" "+product2.getQuantity()+" "+product2.getPrice());
    }
}
