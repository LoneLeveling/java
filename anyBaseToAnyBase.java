//Given 3 numbers: n<--number, b1<---base of n, b2<--desired base
import java.util.Scanner;
public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int b1=sc.nextInt();//base in which n exists
int b2=sc.nextInt();//base you want to convert n to.
    //Aim: 1st convert to decimal and then to b2 base.
        int deconversion=Cal(n,b1);
//        System.out.println(decCOnversion);
int finalAns=decTob2Base(deconversion,b2);
        System.out.println(finalAns);
    }

//Cal function converts num to decimal base
    public static int Cal(int n,int b1){
        int rev=0;
        int pow=1;
        while(n>0){
            int rem=n%10;
            rev+=rem*pow;
            pow=pow*b1;
            n=n/10;
        }


        return rev;
    }
public static int decTob2Base(int deconversion, int b2 ){
        int rev=0;
        int pow=1;
       while (deconversion>0){
           int rem=deconversion%b2;
           rev+=rem*pow;
           pow=pow*10;
           deconversion=deconversion/b2;
       }

        return rev;
}

}
