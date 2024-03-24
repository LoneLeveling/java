import java.util.Scanner;

//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class targetProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num={2,4,1,3,2};
        int k=8;//target
        //{0,2} ,{2,4}
        for (int i=0;i<num.length-1;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i]+num[j]==k){
                    System.out.println("{"+i+","+j+"}");
                }
            }
        }
throw new IllegalArgumentException("No solution");

    }
}
