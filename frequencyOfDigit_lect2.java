import java.util.Scanner;

public class frequencyOfDigit_lect2 {

    //Given a number n=34678392;
//    and another number r=3;
//    o/p how many times 3 exists in n, like for above ans = 2;
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int countr=0;
        while(n>0){
            int rem=n%10; //last digit of num we get in remainder.
            if (rem==r){
                countr++;
            }
            n=n/10;
        }
        System.out.println(r+" found "+ countr +" times");
    }

    }
