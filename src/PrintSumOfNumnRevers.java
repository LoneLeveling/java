//Need to print the sum of number and its reverse.
//ex: num=153, rev=351, sum=num+rev=504
public class PrintSumOfNumnRevers {
    public static void main(String[] args) {
        int num=153;
        int num1=num;
        int rev=0;
        while (num!=0)
        {
            rev=rev*10;
            rev+=num%10;
            num/=10;
        }

        int sum=num1+rev;
        System.out.println(sum);
    }
}
