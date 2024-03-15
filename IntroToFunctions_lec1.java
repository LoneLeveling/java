import java.util.Scanner;
//Code to find nPr, which is = n/(n-r)!
public class IntroToFunctions_lec1 {

    public static void printFunc(int nfact, int nminusr){
        int ans = nfact/nminusr;
        System.out.println(ans);
  }
    public static int fact(int x){
        int ans =1;
        for (int i=1;i<=x;i++){
            ans*=i;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
        int r=sc.nextInt();
       int nfact=fact(n);
      int nminusr= fact(n-r);
      //Below line no:20 to 26 equivalent to line 5 and 12.
//    for (int i=1;i<=n;i++)
//    {
//        nfact*=i;
//    }
//    for (int i=1;i<=n-r;i++){
//        nminusrfact*=i;
//
//    }


//        Below 2 lines equivalent to line 5-8
        printFunc(nfact,nminusr);
//    int nPr=nfact/(nminusr);
      //  System.out.println(nPr);

    }
}
