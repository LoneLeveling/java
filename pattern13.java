//RMBR: iC(j+1) = iCj *(i-j)/[j+1]
//So you can get value of next iCj by previous one
import java.util.Scanner;
//https://ningrumm.medium.com/push-files-in-specific-folder-on-github-f25dd2ddec21
public class pattern13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            int icj=1;
            for (int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1= icj* (i-j)/(j+1);  //icjp1= iCj +1
                icj=icjp1;
            }
            System.out.println();
        }

    }
}
