import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n / 2;
        int st = 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Printing numbers
            int cnum = num;
            for (int j = 1; j <= st; j++) {
                System.out.print(cnum + "\t");

                // Increment num for the first half of the pattern
                if (j <= st / 2) {
                    cnum++;
                }
                // Decrement num for the second half of the pattern
                else {
                    cnum--;
                }
            }

            // Update sp, st, and startNumber for the next iteration
            if (i <= n / 2) {
                sp--;
                st += 2;
                num++;
            } else {
                sp++;
                st -= 2;
               num--;
            }

            System.out.println();
        }
    }}