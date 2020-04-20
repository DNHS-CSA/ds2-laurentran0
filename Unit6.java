
/**
 * Write a description of class Unit6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit6
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit6
     */
    public void a()
    {
        // initialise instance variables
        System.out.println("\nQuestion 6.12, Skill 1.B");
        int[] numArr = {1, 3, 5, 7, 9};
        
        for (int k = 0; k < numArr.length / 2; k++){
         int temp = numArr[k];
         numArr[k] = numArr[numArr.length - k - 1];
         numArr[numArr.length - k - 1] = temp;
        }

        /*This works because within the for loop, it will go through the array switching the 
         elements at the front of the array with the elements at the end of it. The loop ends 
         when k is half of the array length because that is when all of the array's elements 
         are reversed in their order*/
    }

    public void b()
    {
    System.out.println("\nQuestion 6.13, Skill 5.D");

    int[] values = {1, 3, 8, 0, 5};
    int maximum = values[0];

     for (int k = 1; k < values.length; k++)

     {

        if (values[k] > maximum)

        {

            maximum = values[k];

        }

     }
    System.out.println(maximum);  
    /*This works because you can compare as the loop traverses through the array, it will compare
       it to the current maximum. In this case, the maximum is initially set as value[0]. When
       it goes through the loops, if the element in the next index of the array is larger than
       the previously set maximum, a new max will be set until it finishes going through the 
       entire array. Once it's finished, the maximum will be the largest value in the array*/
  }
   
  public void c()
  {
      int[] values = {1, 3, -8, 0};  
      int index = 0; 
        while (values[index] >= 0)
    {

        index++;

    }
    System.out.println(index);
    /*There has to be a negative integer in the array because if there isn't, then the loop
       will continue to evaluate past the array's index leading to an exception. So, at least 
       one negative number is required to be present in the array*/
  }
}
