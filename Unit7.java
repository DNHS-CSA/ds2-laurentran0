
/**
 * Write a description of class Unit7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit7
     */
    public Unit7()
    {
        // initialise instance variables
        x = 0;
    }

  
    public static void insertionSort(int[] elements)

    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;   // line 10
          }
            elements[possibleIndex] = temp;
        }
}
}
