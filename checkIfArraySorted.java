import java.util.Scanner;

public class checkIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    boolean ans1 =arraySortedOrNot(arr,n);
        System.out.println(ans1);
    }

        public static boolean arraySortedOrNot( int[] arr, int n){
            // code here

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i + 1] < arr[i])
                {
                    return false;
                }
            }
            return true;

        }
    }

