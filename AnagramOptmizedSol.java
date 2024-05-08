import java.util.Scanner;

public class AnagramOptmizedSol {
    static final int CHAR=256;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(checkAnagram(s1,s2));

    }

    //We use a standard technique which is used in many string qstns:
//    The idea is to use characters as indexes in an array
    //So we create a count array of size 256 , 256 cuz we assuming we have
    // all the ASCII characters in our input string.
    public static boolean checkAnagram(String s1, String s2)
    {
if(s1.length()!=s2.length()){
    return false;
}
else{
    int[] count= new int[CHAR];
    for (int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    for (int i=0;i<CHAR;i++)
    {
        if (count[i]!=0){
            return false;
        }
    }

}
        return true;
    }
}
