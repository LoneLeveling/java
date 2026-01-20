public class CarryAddition {
    public static void main(String[] args) {
        int num1=123;
        int num2=908;
        int carry=0;
StringBuilder sb1=new StringBuilder();
        while (num1>0||num2>0)
        {
            int sum=num1%10+num2%10+carry;
            sb1.append(sum%10);
            carry=sum/10;
            num1/=10;
            num2/=10;
        }
        if (carry>0) sb1.append(carry);

        System.out.println(sb1.reverse());
    }
}
