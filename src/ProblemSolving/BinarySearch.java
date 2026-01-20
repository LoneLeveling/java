package ProblemSolving;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,10,12,16};
        int target=101;
       int ans =binarySearch(arr,target);
       if (ans>=0)
        System.out.println("found at index: "+ans);
    else System.out.println("element: "+target+ " doesn't exist in the array");
    }

    static int binarySearch(int[] arr, int target)
    {
        int low=0;
        int high=arr.length-1;
        while (low<=high)
        {
            int mid =low +(high-low)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<target)
            {
            low=mid+1;
            }
            else high=mid-1;
        }
        return -1;
    }

}