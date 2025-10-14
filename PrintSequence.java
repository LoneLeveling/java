//Take 'n' as input from user and print the following sequence: 1, n, 2, n-1, 3, n-2, ...
public class PrintSequence {
    public static void main(String[] args) {
        int n=10;
        int b=n;
        int a =1;
        for (int i =0; i <= n; i++) {
            System.out.print(a+ " ");
            System.out.print(b+" ");
            a++;
            b=b-1;
        }
    }
}
