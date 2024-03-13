import java.util.Scanner;

public class pattern25 {

    //Pattern:
//    *                *
//    *                *
//    *       *        *
//    *   *       *    *
//    *                *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < n / 2 + 1) {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else if (i >= n / 2 + 1) {
                    if (j == 1 || j == n||i+j==n+1||i==j) //rmbr: for diagonal elements, i+j==n+1 and i==j was the condition
                        //As here we have diagonal stars in lower half(i>=n/2+1) so we used the 2 condtns in the for loop
                    {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

            }
            System.out.println();
        }
    }

        }

