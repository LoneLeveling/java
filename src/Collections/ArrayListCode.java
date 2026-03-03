package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCode
{
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(10);
        alist.add(20);
        alist.add(30);
        System.out.println(alist.set(1, 100));//prints the replaced element
        alist.add(40);
        System.out.println(alist);

        List<Integer> alist2 = new ArrayList<>(alist); //we can copy the elements of one list into another list,by just passing that list as an argument into the 2nd list.
        System.out.println(alist2);
        alist2.addAll(alist);
        System.out.println(alist2);
        System.out.println(alist2.indexOf(30));

        System.out.println(alist2.lastIndexOf(30));//returns the index of the last occurence of object 'o'
    }
}
