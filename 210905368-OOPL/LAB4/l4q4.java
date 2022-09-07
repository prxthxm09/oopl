class Counter
{
    static int count = 0;
    {
        count++;
    }
    static int showCount()
    {
        return (Counter.count);
    }
}
class l4q4
{
    public static void main(String[] args)
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        int cc = Counter.showCount();
        System.out.println("Number of objects are "+cc);
    }
}