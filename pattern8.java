//PATTERN:

//                    *
//                *
//            *
//        *
//    *

//sp st
//4   1
//3   1
//2   1
//1   1
//0   1

import java.util.Scanner;

public class pattern8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int st=1;
        int sp=n-1;
        int cnt=1;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            sp-=1;
//            st=1; st= constant
            System.out.println();
        }

    }

}


//APPROACH 2: Sum of mirrored diagonal elements > (i+j)=n+1
//say n=5 , then all the stars are at a location ==> where sum of i & j = (n+1) = 6
//CODE:

// for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//         if(i+j==n+1){
//         System.out.print("*\t");
//         }else {
//         System.out.print("\t");
//         }
//
//         }
//         System.out.println();
//         }