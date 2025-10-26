//Ques: Display this GP: 1, 2,4,8,.. up to n terms
public class GeometricProgression {
    public static void main(String[] args) {
        int a =1, r=2;
        int n=10;//no. of terms to be printed
        for (int i =1; i <=n; i++) {
            System.out.print(a+" ");
            a*=r;

        }
    }
}
