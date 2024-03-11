//lect9
//Program which prints user's name and his desired pattern
import java.util.Scanner;

public class takingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking String input
        System.out.println("Enter your name");
        String userName=sc.next();

        System.out.println("Enter num");
        int num=sc.nextInt();

        //If taking only int input in code then you can use : int num=sc.nectInt(),
        //If taking only string input in your code then you can use: String str = sc.next();
        //If taking both integer and String input then you can also use below for int ans string respectively:
//        int num = Integer.parseInt(sc.nextLine());
//        String name = sc.nextLine();


        System.out.println("Hi "+userName+" below is your desired pattern");
        for (int i=1;i<=num;i++){
            System.out.println(i);
        }

    }
}
