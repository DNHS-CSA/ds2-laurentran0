public class Unit5BQ8

{
    private String firstName;
    private String lastName;
    private int age;
    public Unit5BQ8(String firstName, String lastName, int age)
    {
        firstName = firstName;
        lastName = lastName;
        age = age;
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }
    //Code below is not originally included
    public void a()
    {
        Unit5BQ8 s = new Unit5BQ8("Priya", "Banerjee", -1);
        System.out.println(s);
    }
    /*This code will compile but not work as expected. This is because the instance variables
       are not initialized correctly. Variables firstName, lastName, and age are only local
       vairbles existing in the constructor.*/
}