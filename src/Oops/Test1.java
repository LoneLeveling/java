package Oops;

public class Test1 {
    String obj_name;

    Test1(String obj_name)
    {
        this.obj_name=obj_name;
    }

    static void show()
    {
        Test1 t1= new Test1("t1");
        display();
    }

    static void display()
    {
        Test1 t2=new Test1("t2");
    }

    public static void main(String[] args)
    {
        show();
    System.gc();
    }

    


}
