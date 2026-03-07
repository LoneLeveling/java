//Finding middle of a Linked List
package Collections.LinkedLIst;

import java.util.LinkedList;

public class Code4 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        int middleIndex=0;
        ls.add("Java");
        ls.add("Python");
        ls.add("C++");
        ls.add("Go");
//        ls.add("Rust");
        if(ls.size()%2==0)//list=even size
        {
             middleIndex=ls.size()/2 -1;
            System.out.println(ls.get(middleIndex));
        }

        System.out.println(ls.get(middleIndex));
    }
}

