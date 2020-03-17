public class Unit5BQ5

{
    private int numOunces;
    private static int numSold = 0;
    public Unit5BQ5(int numOz)
    {
        numOunces = numOz;
    }
    public static void sell(int n)
    {
        /* implementation not shown */
    }
    /*Because static methods can both access and update static variables, numSold can be accessed 
       and updated by the method sell. However, because numOunces is an instance variabe, it 
       cannot be accessed nor updated by the static method sell*/
}