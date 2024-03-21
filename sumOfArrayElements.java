import java.util.Scanner;

public class sumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input Array elements");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        sum=sum+arr[i];
        }

        System.out.println(sum);
    }
}
