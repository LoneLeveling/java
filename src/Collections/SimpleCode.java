package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleCode {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        ls.add(60);
        Iterator<Integer> it = ls.iterator();//returns an Iterator object
        while (it.hasNext())
        {
            Integer num=it.next();
            System.out.print(num+" ");
            ls.add(80);//throws concurrentModificationException
        }

    }
}
