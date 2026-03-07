//Reversing a linked list
package Collections.LinkedLIst;

import java.util.Collections;
import java.util.LinkedList;

public class Code3 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Java");
        ls.add("Python");
        ls.add("C++");
        ls.add("Go");
//        Collections.reverse(ls);
        System.out.println(ls);

        System.out.println("---------------------------");
        LinkedList<String> reversedList = new LinkedList<>();
//        for (int i = ls.size()-1; i >=0 ; i--) {
//            reversedList.add(ls.get(i));
//        }

        for(String s :ls)
        {
            reversedList.addFirst(s);
        }
        System.out.println(reversedList);
    }
}
