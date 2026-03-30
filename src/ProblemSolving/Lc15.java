package ProblemSolving;

import java.util.*;

public class Lc15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++)
        {
            for (int j = i + 1; j < nums.length - 1; j++)
            {
                for (int k = j + 1; k < nums.length; k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        System.out.println(set);
    }
}
