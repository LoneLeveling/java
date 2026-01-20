import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] num={9,9,9,9,9,9,9,9,9,9};
        int k=1;
StringBuilder sb = new StringBuilder();
for (int n:num)
{
    sb.append(n);
}
BigInteger x = new BigInteger(sb.toString());
BigInteger sum=x.add(BigInteger.valueOf(k));
        System.out.println("sum: "+sum);
String s = sum.toString();

        List<Integer> ls = new ArrayList<>();
        for (char c:s.toCharArray())
        {
            ls.add(Character.getNumericValue(c));
        }
        System.out.println(ls);

                }



}
