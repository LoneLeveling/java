//PATTERN:
//
//*   *    *        *   *   *
//*   *                 *   *
//*                         *
//*   *                *    *
//*   *    *       *   *    *


//This pattern is different from prvs examples, here rows=5 but columns =7.

//  st     sp    st
//   3     1     3
//   2     3     2
//   1     5     1
//   2     3     2
//   3     1     3


import java.util.Scanner;

public class pattern6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n=sc.nextInt();
       int st=(n/2) +1;  //note in this case (1st line) unlike previous qstn stars != n/2 but (n/2) +1
       int sp=1;  //space initially = 1
        for (int i=1; i<=n;i++){

            //NOTE : Here we used 3 for loops because 1st we nned to print stars then space and then again stars , so sequence
            //so as we 1st have stars and then we have spaces and then again stars , acc. we have arranged our for loops.
            //1st one print stars then 2nd one prints spaces and then 3rd one prints again stars
            //TRY TO CHANGE THE SEQUENCE OF FOR LOOP AND YOU WILL SEE DIFF. PATTERNS
            //SO NOTE HOW SEQUENCING OF FOR LOOP AFFECTS PATTERN :)
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
          for (int j=1;j<=sp;j++){
                System.out.print("\t");
          }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                st-=1;
                sp+=2;
            }
            else {
                st+=1;
                sp-=2;
            }
            System.out.println();
        }
    }


}
