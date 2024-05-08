import java.util.Scanner;
//Given 2 strings s1,s2 in a way that s2 contains all characters of s1 in any
//permutation but +1 extra character.
//You need to print that extra character.
//ex: s1="abcd" and s2="aecdb", so you need to print 'e'  <--- the extra character.
public class findExtraCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 1st string");
        String s1=sc.next();
        System.out.println("Input 2nd string");
        String s2=sc.next();
        System.out.println(extraChar(s1,s2));
    }

    static StringBuilder extraChar(String s1, String s2){

       StringBuilder str = new StringBuilder();

        for (int i=0;i<s2.length();i++)
        {
            int countr=-1; //resetting counter for each element
            for(int j=0;j<s1.length();j++)
            {
             if (s2.charAt(i)==s1.charAt(j)){
                 countr++;
             }

            }
            if (countr<0){
              str.append(s2.charAt(i));
            }

        }

        return str;
        //Note: If you use function return type as 'string' but using StringBuilder for string object
//        then instead of "return str" you'll use "return str.toString();"
    }
}
