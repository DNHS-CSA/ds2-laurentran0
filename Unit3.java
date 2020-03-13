
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
    {   System.out.println("\nQuestion 3.3, Skill 4.B");
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
   /*If the temperature is less than or equal to 31 degrees, then the weather
      should display "cold". However, in this case, when we run it, we get 
      "warm" instead. This shows that setting temp to 30 will prove that the 
      code has fault in it. Having temp be 30 goes to warm because the temp is
      less than 51, so it evaluates to false. Then it goes to else, which is
      then "warm"*/
    public void b()
    {
     System.out.println("\nQuestion 3.7, Skill 2.C");
     String first = new String("duck");
     String second = new String("duck");
     String third = new String("goose");
        if (first == second)
        {
            System.out.print("A");
        }
        else if (second == third)
        {
            System.out.print("B");
        }
        else if (first.equals(second))
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
        /*This will print out C because the third condition evaluate to true.
          The first two conditions are false because == compare references of
          an object, not content while .equals compares content which is "duck"
          in this case*/
    }
    public void c()
    {   System.out.println("\nQuestion 3.4, Skill 4.C");
        int result = 0;
        int x = 1;
        int y = 2;
        //Code Segment 1
        if (x > y)
        {
            result = x - y;
            System.out.println("Code 1:" + result);
        }
        else if (x < y)
        {
            result = y - x;
            System.out.println("Code 1:" + result);
        }
        else
        {
            System.out.println("Code 1: " +result);
        }
        //Code Segment 2
        if (x < y)
        {
            System.out.println("Code 2:" + (y - x));
        }
        else
        {
            System.out.println("Code 2:" + (x - y));
        }
        /*Both code segment 1 and 2 print out the same value because they both
           print out the absolute value of the difference between x and y. As 
           a result, no matter what, it will just be the difference*/
    }
    public void d()
    {var j = 2;
     var k = 6;
     var m = 3;
        if(!((j == k) && (k > m)))
        { System.out.println("Code 1: Hello");
        }
        if((j != k) || (k <= m))
        { System.out.println("Code 2: Hello");
        }
        /*Both end up printing the same due to De Morgan's laws.*/
    }

}
