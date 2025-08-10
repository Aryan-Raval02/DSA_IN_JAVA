import java.util.*;

public class FizzBuzz {
    public static List<String> fizzbuzz(int n)
    {
        List<String> list = new Vector<>();

        for(int i=1;i<=n;i++)
        {
            if(i%15 == 0) { list.add("FizzBuzz"); }
            else if(i%5 == 0) { list.add("Buzz"); }
            else if(i%3 == 0) { list.add("Fizz"); }
            else { list.add(String.valueOf(i)); }
        }

        return list;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(fizzbuzz(3));
        System.out.println(fizzbuzz(5));
        System.out.println(fizzbuzz(15));
    }
}
