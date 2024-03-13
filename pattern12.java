import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;

        int b=1;

        int c=0;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+"\t");
                //Imp: Note above we choosed to print 'a' of all the 3 variables i.e., 'b' & 'c'
                //bcz 'a' is the only variable which travels through all the sequences/values.
                //If you start with 'b' then we'll miss 0
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
            }


    }
}
