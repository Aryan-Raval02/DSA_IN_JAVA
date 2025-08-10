import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(2);
        arr.add(10);
        arr.add(12);
        arr.add(15);
        arr.addLast(34);

        System.out.println(arr.size());

        System.out.println(arr.capacity());

        System.out.println(arr);
        for(int x : arr) System.out.print(x+" ");

        System.out.println("\n----------------------------");

        Vector<Vector<Integer>> arr2 = new Vector<>();
        arr2.add(arr);
        arr2.add(arr);

        System.out.println(arr2);
    }
}