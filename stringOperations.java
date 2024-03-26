public class stringOperations {
    public static void main(String[] args) {
        //Will see some string operation here

//        1. equalsIgnoreCase() : this method will compare content of 2 strings, Ignoring their cases.
        String s1="john";
        String s2="jOHn";
        //Now content of both ='s same and as this method ignored cases so: o/p = true
        System.out.println(s1.equalsIgnoreCase(s2));


//        2. toUpperCase() : this method converts the input string to upper case.
        String s3="miky";
        System.out.println(s3.toUpperCase());

//3. substring(start Index, End Index+1)
        String str="geeks";
        System.out.println(str.substring(5));//if you try accesing length of string index then no errors but
//        if you try access index greater than length of string then you will get stringIndexOutOfBound exception,
        //that is how its designed in java API documentation. This behaviour is designed to be consistent and prevent throwing an exception in such cases.
       String slice1=str.substring(1,5);
        System.out.println(slice1);

//NOTE: string operations or say any changes made to an immutable string is a costly operation,
        //as everytime any change is made to the string, a new object, a new reference is created.
//        But this is not the case with mutable strings (ex. classes like : stringBuilder & stringBuffer) , whatever changes are made at the same location.
    }
}
