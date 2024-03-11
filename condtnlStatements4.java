//lec8
//while loop
//NOTE:
//while loop keeps running until the condtition is true, i.e.,
//while loop will stop only when there is a false statement inside it.
//So we have to create a condition such that code comes out of while loop,
//else we'll end up with infinite running while loop.
//So below we created a program which prints numbers from 1 to 9
public class condtnlStatements4
{
    public static void main(String[] args) {
        int i=1;
        while (i<10) //while (i<=9)
        {
            System.out.println(i);
            i++; //i+=1; //keeps incrementing i by 1 everytime we enter the loop //note: This is the
            //condition that makes while loop a finite running loop, cuz at one pont i becomes >9 & = false
            //If we remove line num 16 then while (i<10)=while(1<10) = always true hence loop will
            //keep printing 1 infinitely.
        }


//So rmbr in while loop 3 conditions will always be there:
 //No. 1] Initialization (lin no 12)
// No. 2] Increment (line no 16)
// No. 3 ] Evaluation (line 13: Bracket of while)
// so above line 12,line 13 and line 16 can all be written in one line using for loop:

/*      for(int i=1;i<10;i++){
        System.out.println(i);
        }
*/
//vImp: Sequence of how for loop runs is :
//  1st initialization : i=1; then "check" : i<10, then body: sout(i),
//  then increment: i++,then again check is performed (i<10),
//  then body then increment then check...and so on
//SUMMARY: 1st initialization ----->
// then evaluation(check) ---> execution---> increment--->evaluate--->execute-->increment--evaluate-->execute....
   //so initialization happens only once, then loop keeps iterating b/w: check-->print-->Increment
    }
}


