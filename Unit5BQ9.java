public class Unit5BQ9

{
    private String str;
    public Unit5BQ9(String newStr)
    {
        String str = newStr;
    }
    /*While this code compiles, it will not work as intended due to the face that the variable
       str is declared as a String inside the constructor. The intended purpose is for the 
       constructor to initialize instance variable str to a value of the formal parameter 
       newStr. However, a local variable str instead, is assigned to the value of newStr leaving
       str as an instance variable unchanged.*/
}