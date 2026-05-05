package ProblemSolving;

import java.util.Arrays;

public class Lc42 {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};


        //APPROACH 1: TC=O(n) and SC=O(n)
        int[] leftMaxArr = new int[height.length];
        leftMaxArr[0] = height[0];
        int max = height[0];
        int left = 1;
        while (left < height.length) {
            if (height[left] >= max) {
                leftMaxArr[left] = height[left];
                max = height[left];
            } else {
                leftMaxArr[left] = max;
            }
            left++;
        }
        System.out.println(Arrays.toString(leftMaxArr));

        int[] rightMaxArr = new int[height.length];
        int maxR = height[height.length - 1];
        rightMaxArr[height.length - 1] = height[height.length - 1];
        int right = height.length - 1;
        while (right >= 0) {
            if (height[right] >= maxR) {
                rightMaxArr[right] = height[right];
                maxR = height[right];
            } else//meaning if cuurentElement is < maxR, so in that case it should be holding the maxR Value.
            {
                rightMaxArr[right] = maxR;
            }
            right--;
        }
        System.out.println(Arrays.toString(rightMaxArr));

        int sum = 0;
    int k=0;
    int m=0;
    int n=0;
        for(int i=0;i<height.length;i++)
        {
            sum += Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
        }
        System.out.println(sum);
    }
}

