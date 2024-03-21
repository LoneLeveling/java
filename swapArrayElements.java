public class swapArrayElements {
    public static void main(String[] args) {
        int []arr=new int[5];
        arr[0]=10;
        arr[1]=80;
        arr[2]=55;
        arr[3]=35;
        arr[4]=45;
        swap(arr, 0,4);
        //method call for this swap function is made on top of main method in the stack and once
        //the work of this fun. is completed it is removed from the stack.
for (int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }

    public static void swap(int arr[], int i, int j){
int tmp=arr[i];
arr[i]=arr[j];
    arr[j]=tmp;
    }
}
