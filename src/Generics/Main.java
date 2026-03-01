package Generics;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Box<String> b = new Box<>();
//        b.setItem("Apple");
//        System.out.println(b.getItem());
//
//        Product<String, Integer, Float> product1 = new Product<>("Banana",282,80.45f);
//        Product<String, Integer, Float> product2 = new Product<>("Orange",140,1210.8f);
//
//        System.out.println(product1);//getting values via toString
//        System.out.println();
//        System.out.println("product1 Details: "+product1.getItem()+" "+product1.getQuantity()+" "+product1.getPrice());
//        System.out.println("--------------------------------------------------------------------");
//        System.out.println(product2);//getting values via toString
//        System.out.println();
//        System.out.println("product2 Details: "+product2.getItem()+" "+product2.getQuantity()+" "+product2.getPrice());

        OurGenericList<Integer> ourGenericList= new OurGenericList<>();
        ourGenericList.add(10);
        ourGenericList.add(20);
        ourGenericList.add(40);
        ourGenericList.add(60);
        ourGenericList.add(80);
        ourGenericList.add(100);
        System.out.println(ourGenericList.getItemAtIndex(5));
        System.out.println("Looping through the list:");

        Iterator<Integer> iterator = ourGenericList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //  Using for-each loop
//                for (Integer integer:ourGenericList) //OR for(int x:list)
//                {
//            System.out.println(integer);//OR System.out.println(x);
//              }

    }
}
