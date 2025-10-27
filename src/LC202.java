import java.util.HashSet;

//https://leetcode.com/problems/happy-number/submissions/1813316695/
public class LC202
{
    public static void main(String[] args) {
    int n=123;
        HashSet<Integer> seenNumber = new HashSet<>();
        while (n!=1&&!seenNumber.contains(n))
        {
            seenNumber.add(n);
           n=getSumOfSquares(n);
        }

        if (n==1) System.out.println(true);
        else System.out.println(false);
    }

    private static int getSumOfSquares(int n)
    {
         int sum=0;
         while (n>0)
         {
             int dig=n%10;
             sum+=dig*dig;
             n/=10;
         }
        return sum;
    }


}
