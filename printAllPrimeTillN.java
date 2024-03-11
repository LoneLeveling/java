//lec 11
import java.util.Scanner;

public class printAllPrimeTillN {
    //Problem statement:
//    Give 2 numbers , high and low , print all prime numbers b/w them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input low");
        int low = sc.nextInt();
        System.out.println("high");
        int high = sc.nextInt();
        for (int i = low; i < high; i++) {
            int count = 0;
            //logic of finding num is prime or not
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);


            }
        }

    }}







