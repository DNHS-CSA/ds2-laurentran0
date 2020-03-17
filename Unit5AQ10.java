public class Unit5AQ10

{
    private String name;
    private int age;
    public Unit5AQ10(String n, int a)
    {
        name = n;
        age = a;
    }
    public boolean isOlderThan5()
    {
        if (age > 5)
        {
            return true;
        }
        //original code did not have the code beneath this comment
        else
        return false;
    }
    /*Without the else return false statement, it gave an error. To fix this, I decided to try
       and add a return statement to address the issue. The issue occured because there was no
       return value for when an age is less than or equal to 5.*/
}
