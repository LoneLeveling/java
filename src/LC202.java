import java.util.HashSet;

//https://leetcode.com/problems/happy-number/submissions/1813316695/
public class LC202
{
    public static void main(String[] args) {
    int n=123;
        HashSet<Integer> seenNumber = new HashSet<>();//used hashset since it stores uniq values
        while (n!=1&&!seenNumber.contains(n))//checking if n!=1 and number is not present in the hashset "seenNumber"
            //if number is present already then we quit the while loop and return false, cuz only the numbers whose sum of digits end as being 1 are happy number
        {
            seenNumber.add(n);//add new unique value to hashet
           n=getSumOfSquares(n);//calling helper function
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
