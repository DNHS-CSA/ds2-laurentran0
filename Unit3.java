
/**
 * Write a description of class Unit3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit3
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit3
     */
    public Unit3()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void a()
    {
        String weather;
        var temp = 30;
        if (temp <= 31){
            weather = "cold";
        }   
        else{
            weather = "cool";
        }
        if (temp >= 51){
            weather = "moderate";
        }
        else{
        weather = "warm";
    }
    System.out.print("Temperature: " + temp + "Fahrenheit");
    System.out.println(weather);
   }
   /**/
}
