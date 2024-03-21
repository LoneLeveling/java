public class introToArrays {
    public static void main(String[] args) {

        //array of integer type
        int[] marks; //array declartion
    marks= new int[5]; //space allocation for storing marks of 5 kids.
        //line 5 and 6 can be written as :  int []marks = new int[5]

        //marks[0]<--marks of 1st kid
        //marks of 3rd kid = marks[2]
        marks[0]=20;
        marks[1]=50;
        marks[2]=80;
        marks[3]=10;
        marks[4]=90;


//printing an array
        for(int i=0;i<marks.length;i++) //marks.length=5, so i goes till 4 as index starts from 0
        {
            System.out.println(marks[i]);
        }
 

    }

}
