package ProblemSolving;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr ={2,3,-2,4};
        int cnt=1;
        int maxProduct=arr[0];
//        int product=1;
        for(int start=0;start<arr.length;start++)
        {
            for (int end=start;end<arr.length;end++)
            {
                int product = 1;
                for (int j = start; j <= end; j++) {
                    System.out.print(arr[j] + " ");
                    product = product * arr[j];
                }
                maxProduct = Math.max(product, maxProduct);
                System.out.print("------>" + product);
                System.out.println();
            }
        }
        System.out.println(maxProduct);
    }
}

