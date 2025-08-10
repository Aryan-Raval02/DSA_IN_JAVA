public class Swap 
{
    public static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) 
    {
        System.out.println(10+" "+5);
        swap(10, 5);
    }    
}
