public class WhileLoop {
    public static void main(String[] args) {
//        for (int i=0;i<=10;i++)
//        {
//            System.out.println(i+" ");
//        }

        int i=1;
        while (i<=10)
        {
            System.out.println(i+" ");
            i++;
        }

        ///Working of for loop: The initialization is only once i.e., i=0 and then condition is checked and statement is printed and then increment part is done,
        //again "condition check, print, increment" and again "condition check, print, increment" so observe it forms a "U" like pattern.

        //Working of a while loop: Now in case of while loop we initialize outside the loop, NOTE: In case of for loop also if u see initialization does look inside the
        //bracket but its basically done on the inside but hai baahr he since its done only once.
        //So now coming back to while loop: Once initialization is done, 2nd thing is condition check and then print statement and then increment, so its all like for loop only,
        //bs "U" koh seedha krdoh i.e., convert "U" to "I".

        //See below you can convert for loop to look like while loop and this snippet works fine:
//        int k=1;
//        for (;k<=10;)
//        {
//            System.out.println(k+" ");
//            k++;
//        }

    }
}
