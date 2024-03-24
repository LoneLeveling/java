import java.util.Scanner;
//return array with elements less than k
public class lessThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Input Array size");
        int n = sc.nextInt();//array size
        int[] numbers = new int[n];
        System.out.println("Input Array elements");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] ans = lessThan(numbers, k);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

    //write your code here
    public static int[] lessThan(int[] numbers, int k) {
        int countr = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < k) {
                countr++;
            }
        }
        int l = 0;
        int[] ans = new int[countr];
        for (int i = 0; i < numbers.length; i++) {
            if (k > numbers[i]) {
                ans[l] = numbers[i];
              if(l<countr){
                          l+=1;
                           }
            }
        }
        return ans;
    }
}