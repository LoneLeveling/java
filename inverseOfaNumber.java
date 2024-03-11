import java.util.Scanner;

//lec23
public class inverseOfaNumber {
    public static void main(String[] args) {
        //given num= 2341 then its inverse = 4321 (replace position by digit at that place)
//example i/p= 21453 then o/p = 23154
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int inv=0;
int op=1; //op= original place
while(n!=0) {
int od = n%10; //od= original digit //rmbr: % = remainder = gives last digit of a number
int id=op; //inverted digit will be original place
int ip=od; //inverted place will be original digit

    //make change to inverse (inv) using ip and id

     inv=inv+id*(int)Math.pow(10,ip -1);
    //now rmbr we also need to keep shorteng the number and keep inc. the op so:
    n=n/10;
    op++;

}
        System.out.println(inv);
    }
}
