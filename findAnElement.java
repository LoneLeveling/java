//Input array size and array from user and an element d , search if d exists in
// array or not if yes return index where found if not found return -1
import java.util.Scanner;
public class findAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//size of array
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        int d=sc.nextInt(); //Element to be searched
        int indexFound=0;
        int foundChecker=-1;
        for (int k=0;k<arr.length;k++){
            if(arr[k]==d){
               foundChecker=k;
                break; //no need to look further if found
            }

        }
        System.out.println(foundChecker);
    }
}
