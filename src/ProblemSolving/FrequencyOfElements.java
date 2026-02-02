package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,2,4,1,5,1,2,3,1,2,3,4};
        Map<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            }
        System.out.println(map.size());
        }

}
