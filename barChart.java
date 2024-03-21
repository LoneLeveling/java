import java.util.Scanner;

//A bar chart of asterisk representing value of array n
//Take array size as input and array values and no. of asterisk = to element present at that index
public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int max=arr[0];//assuming arr[0] is the max
for (int i=0;i<arr.length;i++){
    if (arr[i]>max){
        max=arr[i];
    }
}
        System.out.println(max);
//Once we have max from above loop we keep decrementing the max and applying below logic:
       for (int k=0;k<arr.length;k++)//wanna run loop n times , n= no. of elements
       {
            for (int i=0;i<arr.length;i++) {
            if (arr[i] < max) {
                System.out.print("\t");
            } else if (arr[i] >= max) {
                System.out.print("*\t");

            }

        }
            max--;
            System.out.println();
        }

    }

}
