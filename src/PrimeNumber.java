public class PrimeNumber {
    public static void main(String[] args) {
        int a = 11;
        boolean flag=false;
        for (int i=2;i<a;i++)
        {

       if (a%i==0)
       {
           flag=true;
           break;
       }
        }
        String ans = (flag==false)? a+" is a Prime": a+ "is not a Prime"; //using ternary operator
        System.out.println(ans);

    }
}
