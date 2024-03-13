import java.util.Scanner;

//Print table of given number n
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
            System.out.println();
        }

    }
}
