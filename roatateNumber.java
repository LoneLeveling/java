//lect 26
import java.util.Scanner;

//num=27391, given k(how much 2 rotate)=2, then o/p= 91273
public class roatateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        //K will decide what will be our divisor
        //Ex: If n=273516 and k=2 then o/p = 162735 , so we took 16 to front ( 2 rotation),
//        and  to be able to do that : divide n by 10^k = 100 , gives rem=16 and quo=2735
//        then rem*10^4+quo = rev number
        int tmp=n;
        int nod=0; //no. of digits
        while(tmp>0){
            tmp=tmp/10;
            nod++; //countr
        }
k=k%nod; // to deal with k > n
        if(k<0)//negative rotations
        {
            k=k+nod; //For ex. if nod = 5 then k=-1 is same as k=+4 //i.e., taking 1 number from left to right is same as taking 4 numbers right to left
        }
        int div=1;
        int mult=1; //multiplier
        for (int i=1;i<=nod;i++) {

            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
            int quo=n/div;
            int rem=n%div;

            int rot=rem*mult +quo; //rotated number
            System.out.println(rot);

    }

}
