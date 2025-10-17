//Display this AP: 2, 5, 8, 11, 14,... upto 'n' terms
public class ArithmeticProgression {
    public static void main(String[] args) {
        int n=5;//number of terms to print
        for (int i = 2; i <= 3*n-1; i=i+3)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    betterCode(2,3,n);
    }


    //In above code we are depending too much on i, here a alternative code below:


    static void betterCode(int a,int d,int n)
    {
//       a=first term, d = difference
        for (int i =1; i <=n ; i++) {
            System.out.print(a+" ");
            a+=d;
        }

    }
}

//Basic: AP= a, a+d, a+2d, a+3d, ...upto nth term i.e., a+(n-1)*d;
//So the loop above will run up until '3n-1' ,
// since:: An = A+(n-1)*d
// An(i.e., nth Term)=2+(n-1)*3;
//An = 3n-1;


