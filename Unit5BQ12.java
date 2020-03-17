public class Unit5BQ12
{
    private String username;
    public Unit5BQ12(String u)
    {
        username = u;
    }
    public void printThis()
    {
        System.out.println(this);
    }
    public String toString()
    {
        return username + "@example.com";
    }
    //Below code is not originally included
    public void a()
    {
        Unit5BQ12 e = new Unit5BQ12("default");
        e.printThis();
    }
    /*As seen when you run this, "default@example.com" is printed. This is because method a creates
       another Email object named e and passes in "default". This sets the username as "default".
       Then, it takes e and calls the printThis method which refers it to the current object
       which is e. It then passes the current object, which is e, to System.out.println() then
       leads to the toString method which will get the username ("default") and add on 
       "@example.com". Therefore, "default@example.com" will be printed.*/
}