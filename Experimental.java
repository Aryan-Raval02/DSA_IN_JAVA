import java.util.Collections;
import java.util.Vector;

public class Experimental 
{
    public static void main(String[] args) 
    {
        Vector<Integer> arr = new Vector<>();
        arr.add(67);
        arr.add(55);
        arr.add(12);
        arr.add(7);
        arr.add(70);

        long start = System.nanoTime();
        Collections.sort(arr);
        long end = System.nanoTime();

         System.out.println("Execution Time : "+ (end-start)+"ns");
        System.out.println("Execution Time : "+ ((end-start)/1000000)+"ms");
    }
}
