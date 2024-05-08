import java.util.Arrays;
import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
int [] arr={94,33,20,45,59,48,20,35};
int i=0;
int j=0;
while(i<arr.length){
    if(arr[i]%2==0){
     int tmp=arr[i];
     arr[i]=arr[j];
     arr[j]=tmp;
        j++;
    }
    i++;
}   

//for (int val:arr){
//    System.out.print(val+" ");
//}
        System.out.println(Arrays.toString(arr));

    }
}
