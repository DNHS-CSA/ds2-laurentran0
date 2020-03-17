public class Unit5BQ3
{
    private int one;
    public Unit5BQ3(int newOne)
    {
        one = newOne;
    }
    public int getOne()
    {
        return one;
    }
    public boolean isGreater(Unit5BQ3 other)
    {
        return getOne() > other.one;
    }
    /*All statements could be used, but I chose to just choose one to represent it.*/
}
