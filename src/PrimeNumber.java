public class PrimeNumber {
    public static void main(String[] args) {
        int a = 12;
        boolean flag=false;
        for (int i=2;i*i<a;i++)
        {

       if (a%i==0)
       {
           flag=true;
           break;
       }
        }
        String ans = (flag==false)? a+" is a Prime": a+ " is not a Prime"; //using ternary operator
        System.out.println(ans);

    }
}
//Basic note: If 'i' is a factor of n then 'n/i' is also a factor of 'n'. Meaning its impossible ke aapkoh square root kae baad factor mil jae aur phlae na milae. It's mathematically impossible.
//if we are given to check for n =10,000 then n=b
