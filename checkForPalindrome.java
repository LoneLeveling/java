import java.util.Scanner;

//Given a string o/p if its palindrome or not.
//Palindrome: A string is called palindrome if it looks the same in both cases,
//no.1: when seeing from left to right and vice versa.
public class checkForPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.println(checkForPalindrome(str));
    }
    public static boolean checkForPalindrome(String str){
        //String rvrs="";
        char[] s1=str.toCharArray();
        char[] s2=new char[str.length()];

        for (int i=0;i<str.length();i++){
            s2[i]=s1[str.length()-i-1];
        }

        for (int j=0;j<str.length();j++){
            if(s1[j]!=s2[j]){
            return false;
            }
        }

       return true;
    }
}


//NOTE:
//There are 2 ways to put elements of s1[] into s2[] in reverse order:
//
//No.1: Taking a countr outside and starting from last index of original string
//
//        int k=0;
//        for (int i=str.length()-1;i>=0;i--){
//        s2[k]=s1[i];
//        k++;
//        }
//
//
//  No.2: starting from 0th index of s2[] <--- array that stores the reverse char. of s1
//
//
//        for (int i=0; i<str.length();i++){
//        s2[i]=s1[str.length()-i-1];
//        }
