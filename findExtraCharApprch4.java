import java.util.Scanner;

//Mos optimal solution: using XOR
public class findExtraCharApprch4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st string");
            String s1=sc.next();
            System.out.println("Enter 2nd string");
            String s2=sc.next();
            System.out.println(findExtraCharcter(s1,s2));
        }

//PROPERTIES OF BIT WISE-XOR OPERATOR:
//    1. XOR of a number by itself gives 0
//    2. XOR of a number with 0 = number
//    3. XOR of n items in any order = same result , its like addition operation.


    public static char findExtraCharcter(String s1, String s2){
       int res=0;
       int n=s1.length();
       for (int i=0;i<n;i++){
           res=res^s1.charAt(i)^s2.charAt(i);
       }
       //then at last we do xor of last character of 2nd string
        res=res^s2.charAt(n);
        return (char)res;
    }
}
