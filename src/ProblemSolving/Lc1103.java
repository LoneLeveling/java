package ProblemSolving;

import java.util.Arrays;

public class Lc1103 {
    public static void main(String[] args) {
        int num_people=4;
        int candies=7;
        System.out.println(Arrays.toString(distributedCandies(num_people,candies)));
    }

    public static int[] distributedCandies(int num_people,int candies)
    {
        int[] res =new int[num_people];
        int give=1;
        int i=0;
        while(candies>0)
        {
         int idx=i%num_people;
         if(candies>=give)
         {
             res[idx]+=give;
             candies=candies-give;
         }
         else
         {
             res[idx]+=candies;
             candies=0;
         }
         give+=1;
         i+=1;
        }
        return res;
    }
}
