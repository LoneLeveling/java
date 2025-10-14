//Find highest number from 3 given nums using ternary operator

public class TernaryOperator {
    public static void main(String[] args) {
        int a=2, b=10,c=4;
        int highest = ((a>b)?(a>c?a:c):(b>c)?b:c);
        System.out.println("Highest number is : "+highest);
    }
}
