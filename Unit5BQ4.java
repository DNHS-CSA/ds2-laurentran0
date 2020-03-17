public class Unit5BQ4
{
    private static int status = 0;
    public Unit5BQ4()
    {
        status = 10;
    }
    public static void setStatus(int s)
    {
        status = s;
    }
    public void c()
    {   Unit5BQ4 a = new Unit5BQ4();
        Unit5BQ4.setStatus(3);
        Unit5BQ4 b = new Unit5BQ4();
    }
    /*Method c of this class creates two objects named a and b by using new Unit5BQ4(). Then, by
       using the setStatus class, status is set to 3 from the original 10. Then by creating 
       another object b, it sets static back to 10.*/
}