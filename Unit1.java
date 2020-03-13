
/**
 * Write a description of class Unit1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Unit1
     */
    public Unit1()
    {
        // initialise instance variables
        
    }

 
    public void a()
    { System.out.println("Question 1.3, Skill 2.A");
      System.out.println("I. 2/5%3 = " + (2/5%3)); 
      System.out.println("II. 2/(5%3) = " + (2/(5%3)));
      System.out.println("III. 2/5 + 1 = " + (2/5 + 1));
      System.out.println("Only II and III evaluate to 1");
      /*Option I does not work because it is 2/5 which would evaluate to 0,
        and it would take the remainder of 0, which would be zero*/
      /*Option II prints 1 because it takes the remainder of 5/3 which is 2,
        then divides 2 by 2 which is 1*/
      /*Option III prints 1 because it takes the remainder of 2/5 which is 0
         since it rounds down, and then adds 1. This ends up equaling 1*/
    }
       public void b()
    { System.out.println("\nQuestion 1.5, Skill 2.B");
      double d = 0.25;
      int i = 3;
      double diff = d - i;
      System.out.println((int)diff - 0.5);
      /*Since i is an int, subtracting d (a double) with i (an int) would
         make it into an int. So diff = 0.25 - 3 would equal -2. Then,
         subtracting a 0.5 from diff would then be -2.5*/
    }
       public void c()
    { System.out.println("\nQuestion 1.5, Skill 5.B");
      //double fact1 = 1 / 2; does not work
      double fact1 = 1.0 / 2;
      double fact2 = 3 * 4;
      double product = fact1 * fact2;
      System.out.println(product);
      /*You have to cast a double to either 1 or 2 in dpuble fact1. Even
         fact1 is a double, 1 and 2 are int by default. So made 1 a double 
         by making it 1.0*/
    }
 
}
