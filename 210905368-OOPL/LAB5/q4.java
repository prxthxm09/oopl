import java.util.*;
class q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        double num = sc.nextDouble();
        String res = String.format("%,.2f",num);
        System.out.println(res);
    }
}