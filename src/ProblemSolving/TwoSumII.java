package ProblemSolving;

public class TwoSumII {
    public static void main(String[] args)
    {
        int[] arr= {2,5,6,8,10};
        int target =11;
        boolean found=false;
        for(int start=0;start<arr.length;start++)
        {
              for (int end=start+1;end<arr.length;end++)
              {
                  if(arr[start]+arr[end]==target)
                  {   found = true;
                      System.out.println(start+1+" "+end+1);
                      break;
                  }
              }
              if(found) break;
        }
    }
}
