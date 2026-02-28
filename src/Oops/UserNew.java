package Oops;

public class UserNew {
    private String name;
    private int age;

    UserNew setName(String name)
   {
       this.name =name.toUpperCase();
       return this;
   }

    UserNew setAge(int age)
   {
       if(age> 18) {
           this.age = age + 5;
       }

       return this;
   }

   @Override
    public String toString()
   {
       return "UserNew[name='"+name +",age="+age+"]";
   }
}
