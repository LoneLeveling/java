//Given a number and a base, convert into given base.
//Example: n=6937 and b=8, then ans=15431

import java.util.Scanner;
public class IntroToNumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
int dn=getValueInBase(n,b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n,int b){
int rv=0;
int power=1;
        while (n>0){
            int digit=n%b;
             rv+=digit*power;
             n=n/b;
power=power*10;
        }

        return rv;
    }
}
