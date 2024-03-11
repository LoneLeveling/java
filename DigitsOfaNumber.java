import java.util.Scanner;

public class DigitsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int temp=num;
        int nod=0; //no od digits
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
      int div=(int)(Math.pow(10,nod-1));
        while (div!=0){
           int q=num/div;
            System.out.println(q);
            num=num%div;
          div=div/10; //reducing power of 10 by 1 each time

        }

    }
}
