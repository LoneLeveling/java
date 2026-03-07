package Collections.LinkedLIst;

import java.util.LinkedList;
import java.util.List;

public class Code1 {
    public static void main(String[] args) {
      LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");
//        for (int i = 0; i < languages.size(); i++) {
//            System.out.println(languages.get(i));
//        }
        for (String lang:languages)
        {
            System.out.println(lang);
        }

        System.out.println("First element:"+languages.getFirst());
        System.out.println("Last element:"+languages.getLast());
        System.out.println("Total elements:"+languages.size());

//        languages.add(0,"JavaScript");
//        languages.add(languages.size(),"Rust");
        languages.addFirst("JavaScript");
        languages.addLast("Rust");
        System.out.println(languages);
    }
}
