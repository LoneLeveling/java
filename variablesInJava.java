//lec3
 public class variablesInJava {
    public static void main(String[] args) {
        int x=15;
        int y=10;
        int v1=x/y;
        int v2=y/x;
        int v3=x%y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
//        NOTE: / = quotient and % = remainder
         int exp= x*y/x+y;
        System.out.println(exp);
//15*10/15+10
        //150/15+10 = 10+10 =20
//        NOte: there's no bodmas in java : *,/,% > +,-
//            i.e., all 3 --> *,/ and % has equal priority and higher to + and minus,
//            also priority of both + and minus also = same..
        //  Now with the use of brackets we adjust whatever priority we want.

        int v4=(x*y)/(x+y);
        System.out.println(v4);


    }
}
