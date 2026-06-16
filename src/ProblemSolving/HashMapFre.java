package ProblemSolving;

import java.util.HashMap;

public class HashMapFre
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple".toLowerCase(),10);
        System.out.println(map.getOrDefault("apple",0));
        System.out.println(map.getOrDefault("Banana",0));
    }
}
