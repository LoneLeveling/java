import java.util.Scanner;
//Time complexty = Theta(n+CHAR) or say O(n)
public class findExtraCharApprch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1=sc.next();
        System.out.println("Enter 2nd string");
        String s2=sc.next();
        System.out.println(findExtraCharcter(s1,s2));
}
public static char findExtraCharcter(String s1, String s2){
        int[] count = new int[26]; //We taking index as 26 cuz we taking only lower case letters into assumption
    int n=s1.length();
   for(int i=0;i<n;i++){
      count[s1.charAt(i)-'a']--;
      count[s2.charAt(i)-'a']++;
   }
   for (int i=0;i<n;i++){
       if(count[i]>0){
           return (char)(i+'a');
       }
   }
  return 0;
}


}
