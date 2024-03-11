//lec5
//Comparing 2 numbers
public class condtnlStatementsPart2 {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 30;

        if (n1 == n2) {
            System.out.println(n1 + " and " + n2 + " are equal");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is greater than " + n2);
            } else {
                System.out.println(n1 + " is less than " + n2);
            }
        }
        //NOTE: line 8: Code going into the else part is an indicator
        // that n1 and n2 are definitely not equal.
    }
}