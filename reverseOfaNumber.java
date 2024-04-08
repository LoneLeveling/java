import java.util.Scanner;

public class reverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0){
        int dig=n%10;    //remainder = gives last digit
            n=n/10; //quo= gives next n value to act on

        System.out.print(dig);    }
        }

}

//2nd way:

// public int reverse(int x) {
//        int rev=0;
//        while(x!=0){
//        int digit=x%10;
//        rev=rev*10+digit;
//        x=x/10;
 //       }
  //      return rev;
 //   }
//}
