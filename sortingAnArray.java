import java.util.Scanner;

public class sortingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input Array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
for (int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}


for (int val:arr){
    System.out.print(val+ " ");
    }
    }
}
