import java.util.Scanner;
//Given 2 numbers num1, num2 (where num2>num1) and a base, output the difference of the 2 numbers
public class anyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(getDiff(num1,num2,b));
    }

    public static int getDiff(int num1, int num2, int b){
        int rv=0;
        int pow=1;
        int carry=0;
        while(num2>0)//keep playing with n2 until its 0, NOTE:num2=larger than num1
        {
            int d1=num1%10;
            num1=num1/10;
            int d2=num2%10;
            num2=num2/10;
            int diff=0;
            d2=d2+carry;
            if(d2>=d1){
                carry=0;
                diff= d2-d1;
            }else  //if d2 is less than d1
            {
              carry=-1;
              diff=d2+b-d1;
            }
rv+=diff*pow;
            pow=pow*10;
        }

        return rv;

    }

}
