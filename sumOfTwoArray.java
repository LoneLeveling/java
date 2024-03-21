import java.util.Scanner;

public class sumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of 1st array");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter elements of 1st array");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Input size of 2nd array");
        int n2=sc.nextInt();
int[] arr2=new int[n2];
        System.out.println("Enter elements of 2nd array");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
int[] sum=new int[n1 > n2? n1:n2]; //Used ternary operator(its like T/F) here, if n1>n2 then size =n1 else n2
int c=0; //carry

        int i=arr1.length-1; //keeping pointers at rightmost index
        int j=arr2.length-1;
        int k=sum.length-1;

        while (k>=0) //dumping elements in k index of sum array
        {
            int d=c; //digit d
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;

        }
        //If carry still remains i.e., c!=0 then print that.
        if(c!=0){
            System.out.print(c+" ");
        }

        for (int val : sum) {
            System.out.print(val + " ");
        }
    }
}
