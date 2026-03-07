package ProblemSolving;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,2,4,22,10,18,5};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int currNum:arr)
        {
            if(currNum>largest)
            {
                secondLargest=largest;
                largest=currNum;

            }
            else if (currNum>secondLargest&&currNum!=largest)
            {
                secondLargest=currNum;
            }
        }
        System.out.println("second largest:"+secondLargest);
        System.out.println("Largest: "+largest);
    }
}
