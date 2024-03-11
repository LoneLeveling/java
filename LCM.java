//LCM= smallest multiplier divisible by both numbers
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int max=0;
        int min=0;
        if(num2<num1){
            max=num1;
            min=num2;
        }else{
            max=num2;
            min=num1;
        }

        int multiplier=1;
        for(int i=1;i<=10;i++){
            multiplier=max*i;
            if(multiplier%min==0){

                System.out.println(multiplier);
                break;
            }
        }

    }
}
