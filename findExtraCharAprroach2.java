import java.util.Arrays;
import java.util.Scanner;
//Given 2 strings s1,s2 in a way that s2 contains all characters of s1 in any
//permutation but "+1 extra character".
//You need to print that extra character.
//ex: s1="abcd" and s2="aecdb", so you need to print 'e'  <--- the extra character.
public class findExtraCharAprroach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1=sc.next();
        System.out.println("Enter 2nd string");
        String s2=sc.next();
        //Idea: 1st sort both the strings then compare the characters 1 by 1 and
        // compare each corresponding element if both do not match then we return
        // that element of 2nd array.
        //Note: There is no sort functions for strings in java,
        // so 1st we convert string into
//        character array and then we can call Arrays.sort on it.

        System.out.println(findExtraCharcter(s1,s2));
    }

    public static char findExtraCharcter(String s1, String s2){
        char[] a1=s1.toCharArray();
        Arrays.sort(a1);
        char[] a2=s2.toCharArray();
        Arrays.sort(a2); //time complxty = O(nlogn) as using the sort func.
        int n=s1.length();
        for (int i=0;i<n;i++){
            if(a1[i]!=a2[i]){
                return  a2[i];
            }
        }
        return a2[n];
    }
}
