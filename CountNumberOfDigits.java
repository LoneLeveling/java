public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n=-8873;
        int nod=0;
        while (n!=0)
        {
            n=n/10;
            nod++;
        }
        System.out.println(nod);



        //Method 2: System.out.println((int)Math.log10(n)+1);
    }
}
