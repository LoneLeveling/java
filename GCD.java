//GCD= greatest divisor (number that divides) both numbers
import java.util.Scanner;

//Given 2 number num1 and num2 , find their GCD
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int gcd=1;
        int min=num1;
        if(num2<num1){
            min=num2;
        }
        else {
            min=num1;
        }
        for(int i=1;i<=min;i++){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

    }
}
