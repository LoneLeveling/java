package Oops;

class Person
{
    int age;
void changes(Person p)
{
    p=new Person();
    System.out.println("Withing changes Method: "+p.age);
    p.age=80;
    System.out.println("After changes Method: "+p.age);
}

}
public class EncapsulationDemo {
   static EncapsulationDemo encapsulationDemo;
    public static void main(String[] args)
    {
Person p = new Person();
p.age=20;
p.changes(p);
        System.out.println(p.age);

    }
}
