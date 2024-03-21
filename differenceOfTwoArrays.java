import java.util.Scanner;

//Given  2 arrays arr1 and arr2 , output result of arr2 - arr1
//ASSUMPTION: Number represented by arr2 is greater.
//NOTE: Do not print leading zeroes
public class differenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of 1st array");
        int n1=sc.nextInt();
        System.out.println("Input 1st array elements");
        int[] arr1=new int[n1];
        for(int i=0;i<arr1.length;i++){
           arr1[i]=sc.nextInt();
        }
        System.out.println("Input size of 2nd array");
        int n2=sc.nextInt();
        System.out.println("Input 2nd array elements");
        int[] arr2=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int[] diff=new int[n2];

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
int c=0; //carrry
while (k>=0) {
    int d = 0;
int a1val=i>=0?arr1[i]:0; //This line is for say arr1 is smaller than arr2 then we have to fill zeroes where there's
// nothing in arr1 , if there is an element at that position then just take that , i.e., arr1[i]

    //Now we subtracting a2 - a1 i.e., j -i so
    if (arr2[j] + c >= a1val) {
        d = arr2[j] + c - a1val;
        c = 0;
    } else {
        d = arr2[j] + c + 10 - a1val;
        c = -1;
    }
diff[k]=d;
    i--;
    j--;
    k--;

}
//code below for avoiding printing leading zeroes
int idx=0;
 while (idx<diff.length){
     if (diff[idx]==0){
         idx++;
     }else {
         break;
     }
 }
 while (idx<diff.length){
     System.out.println(diff[idx]);
     idx++;
 }



    }
}
