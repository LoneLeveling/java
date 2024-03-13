import java.util.Scanner;
////NOTE: Question takes only odd input
//       *	*	*	*	*
//         *	    *
//              *
//          *    *    *
//      *	*	*	*	*
public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;
        int st=n;
//  Loop for printing spaces
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++) {

                System.out.print("\t");
            }
//loop for printing stars and spaces(in upper half part)
            for (int j=1;j<=st;j++){
                if (i>1&&i<=(n/2)&&j>1&&j<st) //this exsprsn defiines area of upper half.
                {
                    System.out.print("\t");

                }
                else{
                    System.out.print("*\t");
                    }
            }


if(i<=n/2){
    st-=2;
sp+=1;
}else {
    sp-=1;
    st+=2;
}
            System.out.println();
        }
    }
}
