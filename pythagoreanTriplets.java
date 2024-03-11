import java.util.Scanner;
//h2=b2+p2, h is always max(a,b,c)
public class pythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }if(c>max){
            c=max;
        }

        //above code checks which of all 3 is the max numbers
        if(max==a){
            boolean flag = ((b*b+c*c)==(a*a));
            System.out.println(flag);
        }
        if(max==b){
            boolean flag = ((a*a+c*c)==(b*b));
            System.out.println(flag);
        } if(max==c){
            boolean flag = ((b*b+a*a)==(c*c));
            System.out.println(flag);
        }

    }
}
