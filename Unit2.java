
/**
 * Write a description of class Unit2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit2
{   
    // instance variables - replace the example below with your own
    private int x;
    Thing someThing;

    /**
     * Constructor for objects of class Unit2
     */
    public Unit2()
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
    public class Thing
    {
        private String color;
        public void main(String[] args)
        {
            System.out.println(someThing);
        }

        public Thing()
        {   
           color = "Blue";

        }
 
        public Thing(String setColor)
        {
            color = setColor;
        }  
        
        /*Using "Thing someThing;" creates and declares a variable named
           someThing, but it does not initialize it. By not initializing it,
           the value of someThing is null*/
    }
    
    public void a()
    {
        System.out.println("\nQuestion 2.9, Skill 1.B");
        int val = (int) (Math.random() * 4 + 1);
        val *= 2;
        System.out.println(val);
        /*Math.random() will give a number between 0 and 1. Then you multiply
         * that by 4 and then add 1.
         * Multiplying it by 2 at the end ensures that the end result is an
           even number*/
    }
}
