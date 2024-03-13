//*
//    *
//        *
//            *
//                *

import java.util.Scanner;


public class pattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        int st=(n/2)-1;
//        int sp=4;
//
//        for (int i=1;i<n;i++){
//            System.out.print(sp+", "+st+" , "+sp);
//            if(i<=)
//        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
            if(i==j){
                System.out.print("*\t");
            }else {
                System.out.print("\t");
            }


            }
            System.out.println();
        }

    }
}
