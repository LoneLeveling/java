//lec 11
//print n fibonacci numbers
import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=1;
        int b=1;
        int c=0;
        System.out.println("Enter how many fibonacci number needed");
        int count=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<count;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
