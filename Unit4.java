/**
 * Write a description of class Unit4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit4
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit4
     */
    public Unit4()
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
        int x = 100;        
        int total = 0;   
        System.out.println("Question 4.1");
        System.out.println("");
        while(x >= 10)
        {

            total = total + x;

            x = x - 10;
          System.out.println(x + ", "); 
        }
        /*You would use x>= 10 because that is the last iteration of the loop.
           The range is between 10 and 100, and x starts at 100. The only thing
           you need is the "lower limit" which will be x >= 10.*/
    }
    public void b ()
    {System.out.println("Question 4.2");
     int num = 12345;
     int sum = 0;
     while (num>0)
     {         
         sum += num % 10;
         num /= 10;
        }
        System.out.println(sum);
     /*The loop needs to be while(num>0) to print out 15 because the code inside
     the loop needs to iterate 5 times before equaling 15. If it were 
     while(num>1), then the loop would stop at num = 1. As a result, the 
     sum would only be 14. So that's why it needs to be num>0 and not num>1*/
    }
    public void c()
    {  System.out.println("Question 4.4");
       int count = 0;
       int number = 20;
       while (number > 0)
         {
           number = number / 2;
           count++;
         }
       System.out.println(count);
       /*Count will be 5 because that is the amount of times the code iterates
          before number becomes 0. Number will be divided
          5 times (10, 5, 2 , 1, and 0), which means the loop iterates 5 times,
          which also means that count increases to 5.*/
    }     
    public void d()
    {System.out.println("Question 4.6");
      int total = 0;
      int num = 100;
      while (num > 0)
        {
            total += num % 10;
            num /= 10;
        }
      int tota = 0;
      int nu = 100;
      for (int k = nu; k > 0; k /= 10)
      {
          tota += k % 10;
      }
       System.out.println("Code 1: " + total);
       System.out.println("Code 2: " + tota);
       /*Code 2 prints out the same value because they perform the same task.
          in Code 2, k is set as nu (which has the same value as num). A new value
          k is then equal to k divided by 10. Which the while loop does with num.
          Then the for loop takes the total, represented by "tota" and is equal
          to the current total added to k % 10. The while loop then does the same 
          thing. This means both loops can be used to substitute each other*/
    }
    public void e()
    {   System.out.println("Question 4.7");
        for (int i = 0; i < 10; i++)
        {
            System.out.print( "*" );
        }
        System.out.println("");
        for (int j = 1; j <= 10; j++)
        {
            System.out.print( "*" );
        }
        /*Both for loops give the same output because both for loops iterates 10
           times each. The first one is from 0 to 10 exclusive which iterates 10
           times. The second one is from 1 to 10 inclusive. While the second one
           starts from 1, it makes 10 inclusive which gives it a total of 10 runs
           as well.*/
    }
    public void f()
    {
    }
    public void g()
    {
    }
    public void h()
    {
    }
    public void i()
    {
    }
    public void j()
    {
    }
}
