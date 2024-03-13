//pattern[Right aligned stars]:
//                *
//            *   *
//        *   *   *
//    *   *   *   *

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int sp=n-1;
     int st=1;
     for (int i=1;i<=n;i++){
//         System.out.println(sp+" , "+st);
         for (int j=1;j<=sp;j++){
             System.out.print("\t");
         }
         for (int k=1;k<=st;k++){
             System.out.print("*\t");
         }
         System.out.println();
         sp--;
         st++;
     }


    }

}
//Hint: 1st control values of variable (space(sp) and star(st)) then control loop with them.


