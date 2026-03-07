package Collections.LinkedLIst;

import java.util.HashMap;
import java.util.LinkedList;

public class Code6 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Java");
        ls.add("Python");
        ls.add("Java");
        ls.add("C++");
        ls.add("Python");
        ls.add("GO");
int count=0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String lang:ls)
        {
//            if(map.containsKey(lang))
//            {
//           map.put(lang,map.get(lang)+1);
//            }else
//            {
//                map.put(lang,1);
//            }

            map.put(lang,map.getOrDefault(lang,0)+1);
        }
        System.out.println(map);
    }
}
