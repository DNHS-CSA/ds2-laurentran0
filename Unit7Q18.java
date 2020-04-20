
/**
 * Write a description of class Unit7Q18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7Q18
{
    public static void selectionSort(int[] elements)
    {
        System.out.println("\nQuestion 7.18, Skill 2.D");
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;   // line 19
            }
        }
    }
    
    public static void methodA()
    {
        int[] arr = {30, 40, 10, 50, 20};
        selectionSort(arr);
    }
    /*The line executes itself every single time an element is swapped into their correct position 
       in the array. Numbers will be swapped 3 times, and so line 19 will execute 3 times as a 
       result*/
}
