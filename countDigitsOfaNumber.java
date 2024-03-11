import java.util.Scanner;

public class countDigitsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n=sc.nextInt();
        int counter =0;
        while(n>0) //OR: while (n!=0)
        {
            n=n/10; //every divisi on by 10 strips off the last digit from the number
            counter ++;
        }

        System.out.println(counter);
    }
}
