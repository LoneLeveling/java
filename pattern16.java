import java.util.Scanner;

//Pattern:
///	       	1
//      2	2	2
//  3	3	3	3	3
//      2	2	2
//          1
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        int num=1;
        for (int i=1;i<=n;i++){

            // Printing leading spaces
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            // Printing numbers
//             int num=(i<=n/2)?i:(n-i)+1;  //so we can use this also by removing : line 15,31,35
            for (int j=1;j<=st;j++){
                System.out.print(num+"\t");
            }
// Updating sp and st for next iteration
            if(i<=n/2){
                sp-=1;
                st+=2;
num++;
            }else {
                sp+=1;
                st-=2;
num--;
            }
            System.out.println();
        }

    }

}

//    The line int num = (i <= n / 2) ? i : n - i + 1;
//    determines the value of num based on whether the current row i is in the first half or the
//    second half of the pattern.
//        If i is less than or equal to half of n, num is set to i,
//        representing the row number in the first half of the pattern.
//        If i is greater than half of n, num is set to n - i + 1,
//        representing the mirrored value for the second half of the pattern.
//        The loop for (int j = 1; j <= st; j++) prints the value of num 'st' times to
//        ensure each row has the correct number of elements according to the pattern.