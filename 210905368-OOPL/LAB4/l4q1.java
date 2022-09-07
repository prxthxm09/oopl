import java.util.*;
class Complex
{
    int a;
    int b;
    Complex()
    {
        a = 10;
        b = 15;
    }
    Complex(int c,int d)
    {
        a = c;
        b = d;
    }
    void Display()
    {
        String c="+";
        if(b<0)
        {
            c="-";
        }
        int t=Math.abs(b);
        System.out.println("Complex number is "+a+c+"i"+t);
    }
}
class l4q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.println("Enter Values for Complex Number ");
        int re = sc.nextInt();
        int im = sc.nextInt();
        Complex c2 = new Complex(re,im);
        c1.Display();
        c2.Display();
    }
}