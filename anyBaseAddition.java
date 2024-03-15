import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();//base of both numbers

        //method call to convert given number of b base into decimal base/base of 10
        int decnum1=toBaseTen(n1,b);
        System.out.println(decnum1);
        int decnum2=toBaseTen(n2,b);
        System.out.println(decnum2);

        //adding both numbers of base 10
          int sum=sumOfNums(decnum1,decnum2);
        System.out.println(sum);
          //conerting back to original base
        System.out.println("final ans="+backToOrigBase(sum,b));
    }
    public static int toBaseTen(int num,int b){
        int rev=0;
        int pow=1;
        while (num>0)
        {
            int rem=num%10;
            rev+=rem*pow;
            pow=pow*b;
            num=num/10;
        }

        return rev;
    }

    public static int sumOfNums(int decnum1, int decnum2){
        int sum=0;
        sum=decnum1+decnum2;
        return sum;
    }
public static int backToOrigBase(int sum,int b){
        int rev=0;
        int pow=1;
        while (sum>0){
            int rem=sum%b;
            rev+=rem*pow;
            sum=sum/b;
          pow=pow*10;

        }
    return rev;
}

}
