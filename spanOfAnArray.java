//Span of Array = max element - min element
import java.util.Scanner;
public class spanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //array size
        int arr[]=new int[n];
        //Taking array input
        for(int k=0;k<arr.length;k++){
            arr[k]=sc.nextInt();
        }
        int max=arr[0];//Assuming 1st element = max
        int min=arr[0];//Assuming 1st element = min
        for (int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span = max-min;
        System.out.println(span);

    }
}
