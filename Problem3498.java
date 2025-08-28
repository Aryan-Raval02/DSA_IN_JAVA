import java.util.HashMap;
import java.util.Map;

public class Problem3498 
{
    public static int reverseDegree(String s) 
    {
        int sum = 0;

        for(int i=0; i<s.length(); i++)
        {
            sum += ( (i+1) * ('z'-s.charAt(i)+1) );
        }

        return sum;

        // Map<Character,Integer> map = new HashMap<>();

        // map.put('a',26);
        // map.put('b',25);
        // map.put('c',24);
        // map.put('d',23);
        // map.put('e',22);
        // map.put('f',21);
        // map.put('g',20);
        // map.put('h',19);
        // map.put('i',18);
        // map.put('j',17);
        // map.put('k',16);
        // map.put('l',15);
        // map.put('m',14);
        // map.put('n',13);
        // map.put('o',12);
        // map.put('p',11);
        // map.put('q',10);
        // map.put('r',9);
        // map.put('s',8);
        // map.put('t',7);
        // map.put('u',6);
        // map.put('v',5);
        // map.put('w',4);
        // map.put('x',3);
        // map.put('y',2);
        // map.put('z',1);

        // int sum = 0;

        // for(int i=0; i<s.length(); i++)
        // {
        //     sum += ( (i+1) * (map.get(s.charAt(i))) );
        // }

        // return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(reverseDegree("abc"));
        System.out.println(reverseDegree("zaza"));
    }    
}
