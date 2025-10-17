public class AraiseTob
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 3;
        int i=1;
        int prod=1;
//        while(i<=b)
//        {
//            prod*=a;
//            i++;
//        }

        for (int j = 1; j <=b ; j++)
        {
        prod*=a;
        }
        System.out.println(prod);
    }
}
