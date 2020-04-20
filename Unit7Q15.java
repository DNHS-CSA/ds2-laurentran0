
/**
 * Write a description of class Unit7Q15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7Q15
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit7Q15
     */
    public int seqSearch()

    {
        System.out.println("\nQuestion 7.15, Skill 5.C");
        int[] arr = {1, 6, 7, 2, 9};
        int target = 6;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                return j;
            }
        }
        return -1;
    }

  
    public int seqSearch2()

    {
        int[] arr = {1, 6, 7, 2, 9};
        int target = 6;
        for (int j : arr)
        {
            if (j == target)
            {
                return j;
            }
        }
        return -1;
    }
    
    /*From running the program, we can see that the the first search returns the index of the 
       target while the second sequential search returns the value of the target. The difference
       in the searches is that in the first search's if statement, j is the index. This is
       compared to the second serach where j is the element instead*/
}
