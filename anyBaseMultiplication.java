import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getProduct(num1, num2, b));
    }
    public static int getProduct(int num1, int num2, int b) {
        int rv = 0;
        int pow = 1;
        while (num2>0){
            int d2=num2%10;
            num2=num2/10;
            int sprd=getProductWithASingleDigit(b,num1,d2);
            //single product
            //purae n1 koh n2 ke sirf phli digit kae sath product kra rhae hain
            rv=getSum(b,rv,sprd*pow);
            pow=pow*10;
        }

        return rv;
    }


    public static int getProductWithASingleDigit(int b, int n1, int d2)  //d2=single rightmost digit of n2
    {
        int pow=1;
        int c=0; //carry
        int rv=0;
while (n1>0||c>0){
int d1=n1%10;
n1=n1/10;
int d=d1*d2+c;
c=d/b; //quo becomes carry
d=d%b; //rem becomes digit. //rember: a number is made up of its rem and quo, now rem stays as spare but quo moves forward as carry.
rv+=d*pow;
pow=pow*10;
}


        return rv;

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
