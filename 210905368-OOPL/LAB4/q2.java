import java.util.*;
class Time
{
    int hh;
    int mm;
    int ss;
    Time()
    {
        hh=12;
        mm=10;
        ss=50;
    }
    Time(int h,int m,int s)
    {
        hh=h;
        mm=m;
        ss=s;
    }
    void Display()
    {
        System.out.println("Time is "+hh+":"+mm+":"+ss);
    }
}
class q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        System.out.println("Enter values for time ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Time t2 = new Time(h,m,s);
        t1.Display();
        t2.Display();
    }
}