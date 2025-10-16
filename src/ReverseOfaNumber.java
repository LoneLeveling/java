public class ReverseOfaNumber {
    public static void main(String[] args) {
        int n=123;
        int rev=0;
        int mul=10;
        while (n!=0)
        {   rev*=10;
             rev+=(n%10);
             n/=10;
        }

        System.out.println(rev);
    }
}
