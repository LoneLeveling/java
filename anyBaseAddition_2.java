import java.util.Scanner;

//2nd approach: using carry
public class anyBaseAddition_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int b=sc.nextInt();

    int sum=getSum(n1,n2,b);
        System.out.println(sum);
    }

    public static int getSum(int n1,int n2, int b){
        int rv=0;
 int c=0;//carry
int pow=1;
        while(n1>0||n2>0||c>0){
            int rem1=n1%10;
            int rem2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int sum=rem1+rem2+c;
            c=sum/b; //carry = quotient, ex: sum=11, then 11/8=1=carry and rem=3=d(digit)
           sum=sum%b; //digit=remainder
            rv+=sum*pow;
        pow=pow*10;
        }
        return rv;
    }

}
