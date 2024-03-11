import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } else {
                i++;
            }
        }
    }
}

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i = 2;
//        int quo = num;
//        int rem=0;
//        while (quo != 1) {
//             quo = quo / i;
//
//             System.out.print(i+" ");
//
//            rem = quo % i;
//            if (rem != 0) {
//                i++;
//              for(int k=2;k<i;k++){
//                  if(i%k==0){
//                      i++;
//                  }
//              }
//
//            }
//
//        }
//       // System.out.println(rem);
//    }
//}
