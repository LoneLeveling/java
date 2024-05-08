import java.util.Scanner;

public class PalindromePointerMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        checkForPalindrome(str);
    }

    public  static void checkForPalindrome(String str){
        boolean isPalindrome= true; //assuming that string is a palindrome
        int startCounter=0;
        int endCounter=str.length()-1;
        while (startCounter<endCounter){
            if(str.charAt(startCounter)!=str.charAt(endCounter)){
                isPalindrome=false;
                break;
            }
            startCounter++;
            endCounter--;
        }
        if (isPalindrome==true){
            System.out.println(str +" is a palindrome");
        }
else {
            System.out.println(str +" is not a palindrome");

        }

    }
}
