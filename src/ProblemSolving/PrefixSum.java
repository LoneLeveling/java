package ProblemSolving;

import java.util.Arrays;

public class PrefixSum 
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int[] preFixSum=new int[n];
        preFixSum[0]=arr[0];
        for(int i = 1; i <n; i++)
        {
            preFixSum[i]=preFixSum[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(preFixSum));

        int[] postFixSum=new int[n];
        postFixSum[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--)
        {
            postFixSum[i]=postFixSum[i+1]+arr[i];
        }
        System.out.println(Arrays.toString(postFixSum));

        int[] ans=new int[n];
       int m=0,k=0,j=0;
       while (j<n)
       {
           ans[j++]=preFixSum[m++]+postFixSum[k++];
       }
        System.out.println(Arrays.toString(ans));
    }
}
