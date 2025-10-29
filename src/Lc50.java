import java.util.concurrent.RecursiveTask;

public class Lc50 {
    public static void main(String[] args) {
        int n=3; int x=2;
//        int prod =x;
//        while (n>1)
//        {
//            prod*=x;
//            n--;
//        }
//        System.out.println(prod);


        if (n==0) System.out.println(1);;

        long N=n;
        if (N<0)
        {
            x=1/x;
            N=-N;
        }
        double result =1;
        double currentProduct=x;

    while(N>0)
    {
        if (N%2==1)
        {
            result*=currentProduct;
        }
        currentProduct*=currentProduct;
        N/=2;
    }
        System.out.println(result);

    }
}
