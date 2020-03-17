public class Unit5AQ12

{
    private int h;
    public Unit5AQ12(int newH)
    {
        h = newH;
    }
    //it was originally public double getH()
    public int getH()
    {
        return h;
    }
    public void a()
    {
        Unit5AQ12 h1 = new Unit5AQ12(5);
        int x = h1.getH();
        System.out.println(x);
    }
    /*We had to change the return type of getH from double to int because h is an int as well.
       The return type should match the value that is being returned*/
}