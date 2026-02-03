package ProblemSolving;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums ={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
// Total product except self = prefix product * postfix product

int m=0;
int n=0;
        int i=0;
        int PreFixProduct=1;
        int PostFixProduct=1;
        int j=0;
        int[] answer= new int[nums.length];
        while(j<nums.length)
        {
            m=j;
            n=j;
// 1. Calculating prefix product
            while(--m>0)
            {
                PreFixProduct*=nums[m];
            }
//2. Calculating postfix product:
            while(++n<nums.length)
            {
                PostFixProduct*=nums[n];
            }
            answer[j]=PreFixProduct*PostFixProduct;
             PreFixProduct=1;
              PostFixProduct=1;
            j++;

        }
        return answer;


    }
}