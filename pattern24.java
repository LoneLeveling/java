import java.util.Scanner;

public class pattern24 {
    //Pattern:
//  *         *  *   *  *
//  *         *
//  *         *
//  *  *   *  *   *  *  *
//            *         *
//            *         *
//  *  *   *  *         *

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for (int i=1;i<=n;i++)
            {
                for (int j = 1; j <= n; j++) {
                    if (i == 1) //if row = 1
                    {
                        if (j == 1 || j >= n / 2 + 1) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }

                    } else if (i <= n / 2) {
                        if (j == 1 || j ==n/2+1) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }

                    } else if (i == n / 2 + 1) {
// this row is independent of j
                        System.out.print("*\t");

                    } else if (i > n / 2 + 1 && i < n) {
                        if (j == n / 2 + 1 || j == n) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }

                    } else //(i==n) <--last row
                    {
                        if (j <=n/2+1 || j ==n) {
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


