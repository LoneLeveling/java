import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //Anagram= given 2 strings s1 and s2,they are called anagram of each other's
    // if all characters which appears in the 1st string appear in the 2nd and
    // also frequency of all the characters must be same in both strings however
    // order of characters may differ.
    // Basically both should be permutations of each other.
//    E.g: s1="listen" , s2="silent" <--- so they both are Anagrams
//    E.g: s1="aaacb" , s2="cabaa" <--- so they both are Anagrams
    //    E.g: s1="aab" , s2="bab" <--- so they both are NOT Anagrams
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(checkAnagram(s1,s2));
    }

    public static boolean checkAnagram(String s1, String s2){
        if (s1.length()!=s2.length()) //if length not same then time complexity (TC) = constant time
        {
            return false;
        }
        else{
            char[] a1=s1.toCharArray();
            char[] a2=s2.toCharArray();
            Arrays.sort(a1); //TC: O(nlogn)
            Arrays.sort(a2); //TC: O(nlogn)
for (int i=0;i<s1.length();i++){
    if(a1[i]!=a2[i]){
        return false;
       }
}

        }
        return true;

    }
}
