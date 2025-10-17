//Print all alphabets with their corresponding ASCII values
public class PrintAlphabetsWithTheirASCIIValues {
    public static void main(String[] args) {
        for (char i ='A'; i <='Z' ; i++) {
            System.out.println(i+" : "+(i+0));
        }
//        System.out.println('A'+0); Note:: To convert a alphabet to corresponding ASCII value add a zero to the character
//        This is the reason why we added a 0 on line 5


        //We can solve this problem in the below way as well: But in this case you must know the ASCII value pre-hand.
        for (int i=65;i<=90;i++)
        {
            System.out.println((char)i+" : "+i );
        }
    }
}
