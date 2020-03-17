
/**
 * Write a description of class Unit5B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5A
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit5B
     */
    public Unit5A()
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
     public boolean a(String phrase, String key, int index)
    {System.out.println("");
     System.out.println("Question 5A.7");
     //0 <= index < key.length()
     String part = phrase.substring(index, index + key.length());
     return part.equals(key);
     /*The best precondition for index is 0 <= index < phrase.length() - key.length() because
        it avoids a runtime error. Not only that, but it also gives the intended result in all
        cases too.*/
    }
    public static int b(int m, int n)
    {System.out.println("");
     System.out.println("Question 5A.8");
     /* Precondition: m >= 0 and n >= 0 */
     int sum = 0;
     for (int j = m; j <= n; j++)
     {
         sum += j;
        }
        return sum;
        /*This method is meant to print the sum of integers greater than or equal to m, as well
           as less than or equal to n. With this, the best precondition for this code is m <= n.
           This is because for it to work as it should, m MUST be less than or equal to n due to
           the fact that the loop starts at m and goes up to n*/
    }
    public void c(int j, int k, String oldString)
    {System.out.println("");
     System.out.println("Question 5A.9");
     /*0 <= j <= k <= oldString.length() */
     String newString = oldString.substring(j, k);
     System.out.println("New string: " + newString);
     /*The best precondition among the choices is 0 <= j <= k <= oldString.length() because it 
        makes j less than or equal to k, which it must. The other preconditions do not address this
        which will cause for an exception to be thrown. Another important thing is that it makes
        k between 0 and oldString.length(), which if it weren't, yet again an exception will
        be thrown.*/
    }
    
}
