
/**
 * Write a description of class Unit7Q16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7Q16
{
    public static void insertionSort(int[] elements)
    {
        System.out.println("\nQuestion 7.16, Skill 2.D");
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
    public static void methodA()
    {
        int[] arr = {10, 8, 3, 4};
        insertionSort(arr);
    }
    /*It iterates 5 times as the while loop iterates every single time an element of an array gets
       shifted to the right from an insertion. Because 5 shifts occur from this code, line 10
       is therefore exectuted 5 times as a result*/
}
