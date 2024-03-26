import java.util.Scanner;

public class IntroToStrings {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="hello";
       String s2=s1;
       s1=s1+"bye";  //s1=s1.concat("bye");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); //o/p = false as strings are immutable
        // cuz of which a diff. object is created for s1 and change not reflected for s2 even though s2=s1.

     //There is another class called StringBuffer and StringBuilder with which
        // We can make string mutable using stringBuffer & stringBuilder classes
        StringBuffer sb1= new StringBuffer("me");
       StringBuffer sb2=sb1; //making sb2 point to same location where s1 is pointing
sb1=sb1.append("forYou");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);
    }

}
