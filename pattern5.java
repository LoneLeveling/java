//        *
//    *   *   *
//*   *   *   *   *
//    *   *   *
//        *

//NOTE: In question i/p number "n" always = odd.
import java.util.Scanner;


public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n/2; //n/2 bcz see for 1st line we have 5/2 = 2 spaces , so we begin with st=n/2
        int st = 1;

        for (int i=1;i<=n;i++){

//            System.out.print(sp+" , "+st);

            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }


            if(i<=n/2){
                sp-=1;
                st+=2;
                System.out.println();
            }
            else //for 3rd row(assuming n=5). Note that till 2nd row (i.e., n/2 = 5/2=2),
            // stars keep decreasing and after 2nd row starts stars increasing,
            // so that part we covering in "else" part
            {
                st-=2;
                sp+=1;
                System.out.println();
            }

        }
//
//        for (int i=n/2;i<=n;i++){
////            System.out.print(sp);
//            System.out.print(sp+" , "+st);
//
//            sp+=2;
//            st--;
//            System.out.println();
//        }

    }
}