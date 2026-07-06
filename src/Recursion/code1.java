package Recursion;

public class code1 {
    public static void main(String[] args) {
        int n=5;
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        printDecreasing(n-1);
        System.out.println(n);
    }
}
