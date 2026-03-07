package Collections.LinkedLIst;

import java.util.LinkedList;

public class Code2 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Java");
        ls.add("Python");
        ls.add("C++");
        ls.add("Go");
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);
    }
}
