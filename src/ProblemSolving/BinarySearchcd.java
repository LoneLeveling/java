package ProblemSolving;

public class BinarySearchcd {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6, 7, 9, 10, 12};
        int target = 7;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
//        int mid=high+low/2;
//        int mid =high-(high-low)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else //target<arr[mid]
            {
                high = mid - 1;
            }
        }
 return -1;
    }
}
