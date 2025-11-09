package Oops;

public class Code1
{
    public static void main(String[] args)
    {
        Test t1= new Test(1);
        Test t2= new Test(2);
        Test.showCount();
        System.out.println("t1 value: "+t1.id);
        System.out.println("t2 value: "+t2.id);
    }
}

class Test
{
    static int count=1;
    int id;
    Test(int id)
    {
        this.id=id;
        count++;
    }

    static void showCount()
    {
        System.out.println("Total: "+count);
    }
}