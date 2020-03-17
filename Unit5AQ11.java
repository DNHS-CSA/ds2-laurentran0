public class Unit5AQ11

{
    private String name;
    private int age;
    public Unit5AQ11(String str, int a)
    {
        name = str;
        age = a;
    }
    //Before it was public getName()
    public String getName()
    {
        return name;
    }
    /*To fix the error, I added a return type to the method. It returns name which is a String,
       so I made the return type a String*/
}