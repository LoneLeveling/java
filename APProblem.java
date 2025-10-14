//Print this series upto number which are +ve: 99,95,91,87,...
public class APProblem {
    public static void main(String[] args) {
    int a =99; int d=4;
        for (int i = 99; i >=0 ; i-=4) {
            System.out.print(i+" ");
        }
        System.out.println();
        method2(a,d);
    }

    static void method2(int a, int d)
    {
        for (int i = 1; a>0; i--) {
            System.out.print(a+" ");
            a-=d;
        }
    }
}
