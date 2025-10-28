import java.util.Arrays;

//https://leetcode.com/problems/plus-one/submissions/1813385895/
public class Lc66 {
    public static void main(String[] args) {
        int[] digits={1,2,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    private static int[] plusOne(int[] digits)
    {
        for (int i =digits.length-1; i >=0 ; i--)
        {

            if (digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits= new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}
