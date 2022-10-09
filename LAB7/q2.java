package myPackages.p1;

class Maximum
{
    static int max(int a,int b,int c)
    {
        int large = a>b?(a>c?a:c):(b>c?b:c);
        return large;
    }
    static double max(double a,double b,double c)
    {
        double large = a>b?(a>c?a:c):(b>c?b:c);
        return large;
    }
    static int max(int[] arr)
    {
        int large = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];
            }
        }
        return large;
    }
    static int max(int[][] arr)
    {
        int large = arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(large<arr[i][j])
                {
                    large=arr[i][j];
                }
            }
        }
        return large;
    }
}
class q2
{
    public static void main(String[] args)
    {
        int arr1[] = {5,9,2,10,6};
        int arr2[][] = {{1,2,3},{4,5,6}};
        int m = Maximum.max(5,9,2);
        double n = Maximum.max(55.23,999.123,22.2012);
        int p = Maximum.max(arr1);
        int q = Maximum.max(arr2);
        System.out.println(m+"\n"+n+"\n"+p+"\n"+q+"\n");
    }
}