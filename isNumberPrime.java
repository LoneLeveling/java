//lec 10
import java.util.Scanner;

public class isNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        //num= prime iff it has 2 divisors i.e, 1 and itself, if its divisible
        //by any number b/w 2 amd num-1 then its not prime.

  int count=0;
        for(int i=2;i<num;i++)
        //OR YOU CAN USE: for(int i=2;i*i<=num;i++) <--going till i<=root(num)
        {
            if(num%i==0){
            count++;
            break; //as son as you find the 1st divisor for num , come out of loop, stop doing divisions further.

            }
        }
     if(count==0){
         System.out.println(num+" is Prime");

     }
     else {
         System.out.println(num +" is not prime");
     }



    }
}
