//        *						*
//        *	*				*	*
//        *	*	*		*	*	*
//        *	*	*	*	*	*	*


import java.util.Scanner;

public class pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int st=1;
    int sp=2*n-3;
    for (int i=1;i<=n;i++){

             for (int j=1;j<=st;j++){
                 System.out.print("*\t");
             }
        for (int j=1;j<=sp;j++){
            System.out.print("\t");
        }
        if (i==n) //this condition for last row. If i==n i.e., last row then print 1 star less cuz we
            // have 7 stars in last row not 8.
            //You can remove below condition and check running code, you will get an extra star in end
        {
            st-=1;
        }
        for (int j=1;j<=st;j++){
            System.out.print("*\t");
        }
st++;
        sp-=2;
        System.out.println();
    }

    }
}
