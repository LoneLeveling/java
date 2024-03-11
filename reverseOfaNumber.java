import java.util.Scanner;

public class reverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0){
        int dig=n%10;    //remainder = gives last digit
            n=n/10; //quo= gives next n value to act on

        System.out.print(dig);    }
        }

}
