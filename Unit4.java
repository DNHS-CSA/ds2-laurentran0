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
        System.out.println("");
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
    {System.out.println("");
     System.out.println("Question 4.2");
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
    {  System.out.println("");
       System.out.println("Question 4.4");
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
    {System.out.println("");
     System.out.println("Question 4.6");
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
    {   System.out.println(""); 
        System.out.println("Question 4.7");
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
    public static int f(String string1, String string2)
   {System.out.println("");
    System.out.println("Question 4.9");
    String temp = string1;
    int position = 0;
    int result = 0;
    while(temp.indexOf(string2) >= 0)
    {
        position = temp.indexOf(string2);
        result++;
        temp = temp.substring(position + 1);
    }
    System.out.println("If, System.out.println(mystery(Mississippi, si)); was printed, 2 will be printed");
    return result;
    /*This because result increments everytime string2, which is "si" appears in string1, which is
       "Mississippi". Because "si" appears twice in "Mississippi", result is 2. Result is then
       returned and printed*/
   }
   public void g()
    {   System.out.println("");
        System.out.println("Question 4.11");
        String str = "AP-CSA";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.substring(i, i + 1).equals("A"))
            {
                System.out.print(i + " ");
            }
        }
        /* This code prints the index of where "A" is in "AP-CSA". "A" appears in the indexes
           0 and 5 and so it prints out 0 and 5*/
    }
    public void h()
    {   System.out.println("");
        System.out.println("Question 4.13");
        for (int k = 0; k < 4; k++)
        {
            for (int h = k; h >= 0; h--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        /*This will produce the intended code segment because it first iterates 4 times due to
          the first for loop, and therefore 4 lines will be printed due to .println().*/
    }
    public void i()
    {   System.out.println("");
        System.out.println("Question 4.14");
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; k < j; k++)
            {
                System.out.println("hello");
            }
        }
        for (int a = 0; a < 4; a++)
        {
            for (int b = a; b < 4; b++)
            {
                System.out.println("hello");
            }
        }
        /*Changing the inner loop to for(int k = j; k < 4; k++) will cause "hello" to be printed
           four more times than the original code. This is a result of changing the inner loop which
           causes for the code to iterate one more time than the original code. The extra iteration
           creates 4 more "hello"*/
    }
    public void j()
    {   System.out.println("");
        System.out.println("Question 4.18");
        int j = 1;
        while (j <= 5)
        {
            for (int k = 4; k > 1; k--)
            {
                System.out.println("ha");  // line 6
            }
            j++;
        }
        /*Line 6 will end up executing 15 times, creating 15 "ha". The while loop iterates 5 times
           first, and then the for loop will iterate 3 times. As a result of both of them iterating
           these amount of times, "ha" is printed 15 times*/
    }
}
