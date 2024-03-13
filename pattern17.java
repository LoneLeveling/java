//PATTERN

//                  1
//             2    3   4
//        3    4	5	6	7
//             2    3  	4
//                  1

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n / 2;
        int st = 1;
        int num=1;
        for (int i = 1; i <= n; i++) {

            // Printing leading spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            // Printing numbers

//
//            if (i <=n/2) {
//                num = i;
//            } else {
//                num =  (n - i + 1); //for 4th row , num =1, (5-4+1=1) so we start from 1
//            }

int cnum=num; //column number
            for (int j = 1; j <= st; j++) {
                System.out.print(cnum + "\t");
                cnum++;
            }
// Updating sp and st for next iteration
            if (i <= n / 2) {
                sp -= 1;
                st += 2;
     num++;
            } else {
                sp += 1;
                st -= 2;
num--;
            }

            System.out.println();


        }

    }
}


