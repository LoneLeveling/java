public class PrintAllFactors {
    public static void main(String[] args) {
int n=60;
        for (int i = 1; i*i <n ; i++) {
            if (n%i==0) {
                System.out.println(i + " ");
                System.out.println(n / i);
            }
        }
    }
}

//Imp Note: Factors of 60 : 1, 2,3 ,4 ,5,6,10,12,15,,20,30,60
//Now rmbr: If i is a factor of n then n/i is also a factor of n.
//there is not chance that you do not get any factor of n before root(n), i.e., root(60)~<8 since root(64)=8, NOTE: i==n/i sp i^2= n ==> i = root(n)
//so : if 6 is a factor than n/i i.e., 60/6 = 10 is also a factor of 60, similarly if 5 is a factor of 60 then 60/5 = 12 is also a factor.
//So to find all the factors of a number we can run the loop just till root(n) and to for printing all the factors we print 2 things: i and n/i , since n/i is also a factor if i is a factor.
//So when n%i==0 it means you got not  only once factor but 2, i.e., "i" and "n/i".