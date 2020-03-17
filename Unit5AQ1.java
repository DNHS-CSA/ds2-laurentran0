public class Unit5AQ1
{
     private int numerator;
     private int denominator;
     public double fractionToDecimal()
     {         
         return (double) numerator / denominator;

        }
        /*To be able to have a method be accessed from another class, you need to make the method
           public, and so this is what we needed to changed*/
    }