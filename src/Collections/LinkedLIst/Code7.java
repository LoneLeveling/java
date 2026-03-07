//Element with highest frequency
package Collections.LinkedLIst;
import java.util.HashMap;
import java.util.LinkedList;

public class Code7 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Java");
        ls.add("Python");
        ls.add("Java");
        ls.add("C++");
        ls.add("Python");
        ls.add("Python");
        HashMap<String, Integer> map = new HashMap<>();
        for(String s:ls)
        {
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else map.put(s,1);
        }

        System.out.println(map);
        int max=0;
       for(int value:map.values())
       {
           if(value>max)
           {
               max=value;
           }
       }

       for(String key:map.keySet())
       {
           if(map.get(key)==max)
           {
               System.out.println(key);
           }
       }
    }
}
