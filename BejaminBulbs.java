//Given n number of bulbs (all off initially) are touched by a voltage fluctuation n number of times,
//for n=1 all becomes ON, for n=2: all bulbs which are multiples of 2 becomes off,
//for n=3: every 3rd bulb (multiples of 3) becomes ON,
//for n=4: every 4th bulb becomes off, for n=5: every 5th bulb becomes ON,
// and so on....You need to output the bulbs which stays ON after the ON and OFF cycles.

import java.util.Scanner;

//DISCUSSION: Take 20 bulbs and start marking for each cycle ON & OFF, you will find that numbers which were touched
//odd number fo times stays ON and ones which were touched ODD no. of times stays OFF.
//So further you will notice that numbers which are perfect square are the ones that stays "ON",
//NOTE: Take 24 and 36 for example:
//factors of 24: 1*24,2*12,3*8;4*6,6*4,8*3,12*2,24*1; <--- Now note that 24 is not a perfect square and also it has 2n factors (even factors)
//Lets now take 36: 1*36, 2*18,3*12,4*9,6*6,9*4,12*3,18*2,36*1; <----Note 36= Perfect square and it has 2n+1 (i.e., odd) factors.
//So all you need to do to solve this question is print all perfect sqaures
public class BejaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      for (int i=1;i*i<=n;i++){
          int sqaure=i*i; //rmbr do not print only i , as we do not need o/p as 2,3,4,etc we need 4,9,16,...so on.i.e., perfect square's
          System.out.println(sqaure);
      }

    }
}
