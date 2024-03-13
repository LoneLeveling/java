import java.util.Scanner;

//        *	 *  *
//        *	*
//        *
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0; //cuz we need 0 spaces in 1st row
        int st=n;  //cuz we need n stars in 1st row
        for (int i=1;i<=n;i++){
//            System.out.println(sp+" , "+st);


            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int k=1;k<=st;k++){
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }




    }
}
