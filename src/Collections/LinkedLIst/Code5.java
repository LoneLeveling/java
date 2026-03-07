//Removing duplicates from a List
package Collections.LinkedLIst;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Code5 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Java");
        ls.add("Python");
        ls.add("Java");
        ls.add("C++");
        ls.add("Python");
        ls.add("GO");

        System.out.println(ls);

        LinkedHashSet<String> uniqElements=new LinkedHashSet<>(ls);
//passing the list into a LinkedHashSe since linkedHashSet removes duplicates and maintains the order of the element.
        System.out.println(uniqElements);
    }
}
