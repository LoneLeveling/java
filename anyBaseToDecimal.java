import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt(); //given base
        System.out.println(getValue(n,base));
    }
    public static int getValue(int n,int base){
        int rv=0;
        int pv=1;
        while(n>0){
            int rem=n%10;
            rv= rv+rem*pv;
//            rv+=pv*base;
            n=n/10;
        pv=pv*base; //keep multiplying power*power

        }


        return rv;    }
}
