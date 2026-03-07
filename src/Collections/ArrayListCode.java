package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCode
{
    public static void main(String[] args) {
//        List<Integer> alist = new ArrayList<>();
//        alist.add(10);
//        alist.add(20);
//        alist.add(30);
//        System.out.println(alist.set(1, 100));//prints the replaced element
//        alist.add(40);
//        System.out.println("alist:"+alist);
//
//        List<Integer> alist2 = new ArrayList<>(alist); //we can copy the elements of one list into another list,by just passing that list as an argument into the 2nd list.
//        System.out.println("alist2:"+ alist2);
//        alist2.addAll(alist);
//        System.out.println("alist2:"+alist2);
//        System.out.println(alist2.indexOf(30));
//
//        System.out.println(alist2.lastIndexOf(30));//returns the index of the last occurence of object 'o'

        List<Integer> list0=new ArrayList<>();
        list0.add(10);
        list0.add(20);
        list0.add(30);
        list0.add(40);
        list0.add(50);
        list0.add(60);
        System.out.println("list0:"+ list0);//printing list0
        List<Integer> list1=list0.subList(1,4);//creating another list via list0 using subList() method.
        System.out.println("list1:"+list1); //[startIndex, endIndex), Note: End index is exclusive.

        list1.set(1,222);//changing the element @index=1 from 20 to 222
        System.out.println("--------After using set() method------->>");
        System.out.println("alist0:"+list0); //Doing above not only changes the element at index 1 in list1,but also it changes it in list0
        System.out.println("alist3:"+list1);
    }
}
